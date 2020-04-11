package com.snw.shop.product.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * <p>Description: 留言列表实体类</p>
 * @Date: 2020年04月09日
 * @author author
 * @version V1.0  
 */
public class Notes implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 5824403773964158197L;
    
    
    /**
     * 主键Id
     */
    private Integer id;
    
    /**
     * 上一级的父id，上级，第一次留言为空
     */
    private Integer parentUserId;
    
    /**
     * 这条记录的用户id
     */
    private Integer userId;

    /**
     * 留言内容
     */
    private String content;

    /**
     * 留言状态，用户删除后，只是改变状态，并未真正删除，只有管理员可永久删除
     */
    private String noteStatus;
    
    /**
     * 是否匿名
     */
    private String isAnonymous;

    /**
     * 点赞
     */
    private Integer agree;

    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 修改时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentUserId() {
        return parentUserId;
    }

    public void setParentUserId(Integer parentUserId) {
        this.parentUserId = parentUserId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNoteStatus() {
        return noteStatus;
    }

    public void setNoteStatus(String noteStatus) {
        this.noteStatus = noteStatus;
    }

    public String getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(String isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Integer getAgree() {
        return agree;
    }

    public void setAgree(Integer agree) {
        this.agree = agree;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

    
    
    

}
