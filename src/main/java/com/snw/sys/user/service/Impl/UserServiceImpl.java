package com.snw.sys.user.service.Impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snw.sys.user.dao.UserDao;
import com.snw.sys.user.entity.User;
import com.snw.sys.user.service.UserService;
import com.snw.util.NoteUtil;

/**
 * 
 * <p>Description: 用户信息表服务类</p>
 * @version V1.0  
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    /**
     * 用户：userDao
     */
    @Autowired
    private UserDao userDao;

    public User login(String account, String pswd) throws NameException, PasswordException {

        //参数格式校验
        if(account==null || account.trim().isEmpty()){
            throw new NameException("用户名不能为�?");
        }
        
        if(pswd==null || pswd.trim().isEmpty()){
            throw new PasswordException("密码不能为空");
        }
        //密码�?�?
        User user=userDao.findUserByName(account);
        if(user==null){
            throw new NameException("用户名错�?");
        }
        System.out.println("数据库拿到的密码�?"+user.getPswd());
        System.out.println("原始密码�?"+pswd);
        String md5Password=NoteUtil.md5(pswd);
        System.out.println("加密密码�?"+md5Password);
        if(user.getPswd().equals(md5Password)){
            return user;
        }else{
            throw new PasswordException("密码错误");
        }
    
    }

    /**
     * 
     * 用户注册（添加一个用户到数据库）
     * @param account
     * @param pswd
     * @param user_name
     * @return
     * @throws NameException
     * @throws PasswordException
     */
    public User regist(String account, String pswd, String user_name) throws NameException, PasswordException {

        //�?测用户名是否存在
        User user=userDao.findUserByName(account);
        if(user!=null){
            throw new NameException("用户名被占用");
        }
        //生成ID
//        Integer id=Integer.parseInt(NoteUtil.createId());
        
        if(user_name==null || user_name.trim().isEmpty()){
            user_name=account;
        }
//        String token="";
        pswd=NoteUtil.md5(pswd);
        user=new User(account, pswd, user_name);
        userDao.addUser(user);
        return user;
    
    }

    public int delete(User user) {
        
        return 0;
    }

    public int insert(User user) {
        
        return userDao.addUser(user);
    }

    public User geUser(int id) {
        
        return null;
    }

    public int update(User user) {
        
        return 0;
    }

    public List<User> query(HashMap<String, Object> map) {
        
        return null;
    }

    public int queryCount(HashMap<String, Object> map) {
        
        return 0;
    }

    public List<User> selecUsers(String code, String noNeedsubCode) {
        
        return null;
    }

    public List<User> getUserTree() {
        
        return null;
    }

     

}
