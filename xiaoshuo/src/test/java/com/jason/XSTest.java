package com.jason;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jason.service.GetXiaoShuoService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class XSTest {

	@Autowired
	private GetXiaoShuoService getXiaoShuoService;
	
	@Test
	public void getTest(){
		getXiaoShuoService.getXiaoShuoByUrl("http://www.biquge.com/2_2893/");
	}
}
