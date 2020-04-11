package com.snw.shop.product.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * <p>Description: 商品列表实体类</p>
 * @Date: 2020年04月09日
 * @author author
 * @version V1.0  
 */
public class ProductList implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1982067373890240921L;


    /**
     * 主键Id
     */
    private Integer id;
    
    /**
     * 这条记录的用户id
     */
    private Integer userId;

    /**
     * 商品名称(耳机等)
     */
    private String name;
    
    /**
     * 商品价格
     */
    private Integer price;

    /**
     * 商品类型。（type是head，耳机的图片显示。type是seafood，海鲜的图片展示。）
     */
    private String type;
    
    /**
     * 商品信息(商品描述)
     */
    private String message;

    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 修改时间
     */
    private Date updatedTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
    
    
}
