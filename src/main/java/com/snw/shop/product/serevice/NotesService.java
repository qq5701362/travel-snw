package com.snw.shop.product.serevice;

import com.snw.shop.product.entity.Notes;

/**
 * 
 * <p>Description: 留言表service接口</p>
 * @Date: 2020年04月09日
 * @author author
 * @version V1.0  
 */

public interface NotesService {
	
	/**
	 * 增加一条留言
	 * @param note
	 * @return
	 */
	int addNote(Notes note);

}
