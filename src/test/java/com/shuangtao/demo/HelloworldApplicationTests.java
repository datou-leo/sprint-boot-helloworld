package com.shuangtao.demo;

import com.shuangtao.demo.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;



/*
 *
 * spring-boot 单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloworldApplicationTests {

	@Autowired
	Person person;

	@Test
	public void contextLoads() {
		System.out.println(person.toString());
	}

	@Autowired
	ApplicationContext ioc;


	@Test
	public void testHelloService(){
		boolean b = ioc.containsBean("helloService");
		System.out.println(b);
	}

}
