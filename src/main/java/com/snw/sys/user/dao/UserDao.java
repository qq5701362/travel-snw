package com.snw.sys.user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.snw.sys.user.entity.User;

/**
 * 
 * <p>Description: 用户信息表Dao</p>
 * @Date: 2019�?7�?8�? 
 * @Company Travelsky
 * @author wanggk
 * @version V1.0  
 */
public interface UserDao {
	
	/**
     * 登录
     * @param params 参数，用户名和密�?
     * @return 用户
     */
    User login(Map<String, Object> params);
	
    
    /**
     * 
     * @param User user  
     * @return int
     */
    int addUser(User user);
    
	/**
	 * 通过id删除
	 * @param  Integer id  
	 * @return int
	 */
    int delete(User user);

    
    /**
     * 
     * @param User user
     * @return int
     */
    int update(User user);
    
    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    User getUser(int id);
    

    /**
     * 查询用户列表
     * @param map
     * @return
     */
    List<User> query (HashMap<String,Object> map);
    
    /**
     * 查询用户总数
     * @return
     */
    int queryCount(HashMap<String,Object> map);


	User findUserByName(String name);
    
}