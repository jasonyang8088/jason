package com.jason.myzss.dao;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jason.myzss.Application;
import com.jason.myzss.domain.Subject;
import com.jason.myzss.domain.Version;
import com.jason.myzss.repository.jpa.SubjectRepository;
import com.jason.myzss.repository.jpa.VersionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@Transactional
public class VersionTest {

	@Autowired
	private VersionRepository versionRepository;
	
	@Autowired
	private SubjectRepository subRepository;
	
	@Test
	@Rollback(false)
	public void saveVersionTest(){
		Iterable<Subject> iter = subRepository.findAll();
		Iterator<Subject> it = iter.iterator();
		while(it.hasNext()){
			Subject sub = it.next();
			Version version = new Version();
			version.setSubject(sub);
			version.setVersionName("苏教版");
			versionRepository.save(version);
			Version version1 = new Version();
			version1.setSubject(sub);
			version1.setVersionName("人教版");
			versionRepository.save(version1);
			Version version2 = new Version();
			version2.setSubject(sub);
			version2.setVersionName("浙江版");
			versionRepository.save(version2);
			Version version3 = new Version();
			version3.setSubject(sub);
			version3.setVersionName("江西版");
			versionRepository.save(version3);
		}
	}
	
	@Test
	public void findTest(){
		Iterable<Version> list = versionRepository.findAll();
		Iterator<Version> it = list.iterator();
		while(it.hasNext()){
			Version v =it.next();
			System.out.println(v.toString());
		}
	}
	
	
	@Test
	public void findByStageTest(){
		Iterable<Version> list = versionRepository.findBySubjectStage((byte)2);
		Iterator<Version> it = list.iterator();
		while(it.hasNext()){
			Version v =it.next();
			System.out.println(v.toString());
		}
	}
}
