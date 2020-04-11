package com.snw.shop.product.serevice.Impl;


import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.snw.shop.product.entity.Notes;
import com.snw.shop.product.serevice.NotesService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class NotesServiceImplTest {
	
	private NotesService notesService;
	
	@Before
	public void init(){
		String[] conf={
				"conf/spring-mybatis.xml",
				"conf/spring-mvc.xml"};
		ApplicationContext ctx =new ClassPathXmlApplicationContext(conf);
		System.out.println(ctx);
		notesService=ctx.getBean("notesService", NotesService.class);
		System.out.println(notesService);
	}

	@Test
	public void testAddNote() {
		Notes note1 = new Notes();
		note1.setUserId(1);
		note1.setParentUserId(2);
		note1.setContent("xxx到此一游");
		note1.setCreateTime(new Date());
		note1.setUpdateTime(new Date());
		notesService.addNote(note1);
	}

}
