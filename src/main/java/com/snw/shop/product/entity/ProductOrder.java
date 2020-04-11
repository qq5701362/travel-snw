package com.snw.shop.product.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * <p>Description: 订单列表实体类</p>
 * @Date: 2020年04月09日
 * @author author
 * @version V1.0  
 */
public class ProductOrder implements Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 6402551825312476760L;

    /**
     * 主键Id
     */
    private Integer id;
    
    /**
     * 这条记录的用户id
     */
    private Integer userId;

    /**
     * 实际付款价格
     */
    private Integer payment;
    
    /**
     * 订单类型(0：收藏夹订单，1：已付款订单，2：购物车订单)
     */
    private Integer orderType;

    /**
     * 支付状态(0：未付款，1：已付款。2：待付款或者在购物车)
     */
    private String payStatus;
    
    /**
     * 订单状态
     */
    private String orderStatus;

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

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
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
