package com.snw.sys.user.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * <p>Description: 用户信息表实体类</p>
 * @Date: 2020年04月09日
 * @author author
 * @version V1.0  
 */
public class User implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 7510989411944143088L;

    /**
     * 主键Id
     */
    private Integer id;
    
    private Integer parent_id;
    /**
     * 工号
     */
    private Integer staff_id;
    
    /**
     * 用户类型
     */
    private String user_type;

    /**
     * 登陆账号
     */
    private String account;

    /**
     * 登陆密码
     */
    private String pswd;

    /**
     * 用户姓名(昵称)
     */
    private String user_name;

    /**
     * �?属部�?
     */
    private Integer dept_id;

    /**
     * 状态类型：0-已删除,1-未删除,2-已停用
     */
    private String status;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String phone;
    
    /**
     * 备注
     */
    private String remark;

    

    /**
     * 是否登录(0-未登�?  1-已登�?)
     */
    private String is_logged;
    /**
     * 创建时间
     */
    private Date created_time;

    /**
     * 创建人
     */
    private Integer created_by;

    /**
     * 修改时间
     */
    private Date updated_time;

    /**
     * 修改人
     */
    private Integer updated_by;
    
    public User(){
        
    }
    
    public User(String account, String pswd, String user_name) {
        this.account = account;
        this.pswd = pswd;
        this.user_name = user_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Integer getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(Integer staff_id) {
        this.staff_id = staff_id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIs_logged() {
        return is_logged;
    }

    public void setIs_logged(String is_logged) {
        this.is_logged = is_logged;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public Integer getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Integer created_by) {
        this.created_by = created_by;
    }

    public Date getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(Date updated_time) {
        this.updated_time = updated_time;
    }

    public Integer getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(Integer updated_by) {
        this.updated_by = updated_by;
    }

}
