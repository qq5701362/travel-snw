package com.snw.shop.product.serevice.Impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snw.shop.product.dao.NotesDao;
import com.snw.shop.product.entity.Notes;
import com.snw.shop.product.serevice.NotesService;

/**
 * 
 * <p>Description: 留言表服务类</p>
 * @Date: 2020年04月09日
 * @author author
 * @version V1.0  
 */
@Service("notesService")
public class NotesServiceImpl implements NotesService {
	
	/**
	 * 打印日志
	 */
	private Logger log = Logger.getLogger(NotesServiceImpl.class);
	/**
	 * 注入NotesDao
	 */
	
	@Autowired
	private NotesDao notesDao;
	
	

	@Override
	public int addNote(Notes note) {
		
		int num = notesDao.addNote(note);
		return num;
	}
	
	

}
