package com.snw.sys.user.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.snw.sys.user.entity.User;
import com.snw.sys.user.service.UserService;

public class UserControllerTest {
	
	private UserController userController;
	@Before
	public void init(){
		String[] conf={
				"conf/spring-mybatis.xml",
				"conf/spring-mvc.xml"};
		ApplicationContext ctx =new ClassPathXmlApplicationContext(conf);
		
		userController=ctx.getBean("userController", UserController.class);
	}
	
	@Test
	public void testLogin () {
		String account = "wanggk";
		String pswd = "1122";
		Object login = userController.login(account, pswd);
		System.out.println("用户的密码："+login);
	}

}
