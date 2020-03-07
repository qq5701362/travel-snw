package com.snw.sys.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.snw.sys.user.entity.User;
import com.snw.sys.user.service.UserService;
import com.snw.sys.user.service.Impl.NameException;
import com.snw.sys.user.service.Impl.PasswordException;
import com.snw.util.JsonResult;


@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @ResponseBody
    @RequestMapping("/login.do")
    public Object login(String account, String pswd){
        try {
            User user =userService.login(account, pswd);
            return new JsonResult(user);
        }catch(NameException e){
            e.printStackTrace();
            return new JsonResult(2,e);
        }catch(PasswordException e){
            e.printStackTrace();
            return new JsonResult(3,e);
        }catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(e);
        }
    }
    @RequestMapping("/regist.do")
    @ResponseBody
    public JsonResult regist(String account, String pswd, String user_name){
        try {
            User user = userService.regist(account, pswd, user_name);
            JsonResult json = new JsonResult(user);
            System.out.println(json);
            return json;
            
        }catch (NameException e){
            e.printStackTrace();
            return new JsonResult(2,e);
        }catch (PasswordException e){
            e.printStackTrace();
            return new JsonResult(3,e);
        }catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(e);
        }        
    }
}










