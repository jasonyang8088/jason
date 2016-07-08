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
		Version version = new Version();
		Subject s = subRepository.findOne(Long.valueOf(201));
		version.setSubject(s);
		version.setDepth((byte)1);
		version.setVersionName("苏教版");
		versionRepository.save(version);
	}
	
	@Test
	@Rollback(false)
	public void saveChildVersionTest(){
		Version v = versionRepository.findOne(Long.valueOf(1));
		Version version = new Version();
		version.setVersionName("人教版2018");
		version.setSubject(v.getSubject());
		version.setDepth((byte) (v.getDepth()+1));
		versionRepository.save(version);
		List<Version> list = v.getVersionList();
		list.add(version);
		v.setVersionList(list);
//		versionRepository.save(v);
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
	public void findOneTest(){
		Iterable<Version> list = versionRepository.findByDepth((byte)1);
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
