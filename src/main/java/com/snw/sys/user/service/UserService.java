package com.snw.sys.user.service;


import java.util.HashMap;
import java.util.List;

import com.snw.sys.user.entity.User;
import com.snw.sys.user.service.Impl.NameException;
import com.snw.sys.user.service.Impl.PasswordException;

/**
 * 
 * <p>Description: 用户信息表service接口</p>
 * @Date: 2020年04月09日
 * @author author
 * @version V1.0  
 */
public interface UserService {
    
    

    
    /**
     * 
     * 用户登录
     * @param name
     * @param password
     * @return
     * @throws NameException
     * @throws PasswordException
     */
    User login(String name,String password)
            throws NameException,PasswordException;
    
    
    /**
     * 
     * 用户注册
     * @param account
     * @param pswd
     * @param user_name
     * @return
     * @throws NameException
     * @throws PasswordException
     */
    User regist(String account, String pswd, String user_name)
            throws NameException,PasswordException;
    
    /**
     * 通过ids批量删除
     * @param  
     * @return int
     */
    int delete(User user);

    /**
     * 
     * @param User user  
     * @return int
     */
    int insert(User user);
    

    /**
     * 
     * @param Integer id
     * @return User
     */
    User geUser(int id);
    
    

    /**
     * 
     * @param User user
     * @return int
     */
    int update(User user);
    
   
  
    
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
    
    /**
     * 
     * @param code 编码
     * @param noNeedsubCode 父编�?
     * @return
     */
    public List<User> selecUsers(String code,String noNeedsubCode);
    /**
     * 获取用户�?有数�?
     * @param id
     * @return
     */
    public List<User> getUserTree ();
}
