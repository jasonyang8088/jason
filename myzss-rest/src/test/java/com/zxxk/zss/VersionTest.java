package com.zxxk.zss;

import java.util.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.zxxk.zss.entity.Subject;
import com.zxxk.zss.entity.Version;
import com.zxxk.zss.repository.SubjectRestRepository;
import com.zxxk.zss.repository.VersionRestRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@Transactional
public class VersionTest {

	@Autowired
	private VersionRestRepository versionRepository;
	
	@Autowired
	private SubjectRestRepository subRepository;
	
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
	
	
//	@Test
//	public void findByStageTest(){
//		Iterable<Version> list = versionRepository.findBySubjectStage((byte)2);
//		Iterator<Version> it = list.iterator();
//		while(it.hasNext()){
//			Version v =it.next();
//			System.out.println(v.toString());
//		}
//	}
}
