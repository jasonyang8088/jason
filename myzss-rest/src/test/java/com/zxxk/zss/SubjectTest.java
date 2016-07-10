package com.zxxk.zss;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.zxxk.zss.entity.Subject;
import com.zxxk.zss.repository.SubjectRestRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@Transactional
public class SubjectTest {
	
	@Autowired
	private SubjectRestRepository subRepository;
	
	@Test
	@Rollback(false)
	public void initDataTest(){
		String[] name ={"语文","数学","英语","物理","化学","生物","政治","历史","地理","科学"};
		for(int i=1;i<=3;i++){
			for(int j=1;j<name.length+1;j++){
				Subject sub = new Subject();
				sub.setId(Long.valueOf(i*100+j));
				sub.setStage((byte)i);
				sub.setSubjectName(name[j-1]);
				subRepository.save(sub);
			}
		}
	}

}
