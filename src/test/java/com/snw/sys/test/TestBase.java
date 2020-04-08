package com.snw.sys.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class TestBase {
	public ApplicationContext getContext(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("conf/spring-*.xml");
		return ac;
	}
}





