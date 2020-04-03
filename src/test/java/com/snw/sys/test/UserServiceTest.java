package com.snw.sys.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.snw.sys.user.entity.User;
import com.snw.sys.user.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest extends TestBase {

	private UserService userService;
	
	/*@Before
	public void init(){
		userService = super.getContext()
				.getBean("userService",UserService.class);
	}*/
	
	@Before
	public void init(){
		String[] conf={
				"conf/spring-mybatis.xml",
				"conf/spring-mvc.xml"};
		ApplicationContext ctx =new ClassPathXmlApplicationContext(conf);
		
		userService=ctx.getBean("userService", UserService.class);
	}
	
	@Test
	public void testInsert () {
		User user = new User();
		user.setId(1);
		user.setAccount("zs");
		user.setCreated_by(1);
//		user.setCreated_time(new Date());
		user.setDept_id(2);
		user.setEmail("5412@qq.com");
		user.setIs_logged("1");
		user.setPhone("15777239195");
		user.setUser_type("1");
		user.setPswd("12345");
		user.setUser_name("zhangsan");
		user.setStatus("1");
		
		userService.insert(user);
		
	}
	
	@Test
	public void testRegist () {
		String account = "wangk1";
		String pswd = "112321";
		String user_name = "王五661";
		userService.regist(account, pswd, user_name);
	}
	
	@Test
	public void testRegist1 () {
		String account = "wangfx2";
		String pswd = "1122221";
		String user_name = "王五6221";
		userService.regist(account, pswd, user_name);
	}
	
	@Test
	public void testLogin () {
		String account = "wanggk";
		String pswd = "1122";
		User login = userService.login(account, pswd);
		System.out.println("用户的密码："+login.getPswd());
		
	}
}
