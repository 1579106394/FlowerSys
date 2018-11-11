package com.flower.pojo;

import java.io.Serializable;
import java.util.*;

/**
 * CREATE TABLE `order` (
 *   `order_id` varchar(36) NOT NULL,
 *   `order_user_id` varchar(36) NOT NULL,
 *   `order_created_time` varchar(36) NOT NULL COMMENT '创建时间',
 *   `order_delete` int(2) NOT NULL DEFAULT '1' COMMENT '1正常2删除',
 *   PRIMARY KEY (`order_id`)
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
public class Orders implements Serializable {

    private String orderId;
//    private String orderUserId;
//    private String orderFlowerId;
    private User user;
    private List<Flower> flowerList = new ArrayList<Flower>();
    private String orderCreatedTime;
    private Integer orderDelete;
    private Double orderPrice;

    
    
    
    public Double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderCreatedTime() {
        return orderCreatedTime;
    }

    public void setOrderCreatedTime(String orderCreatedTime) {
        this.orderCreatedTime = orderCreatedTime;
    }

    public Integer getOrderDelete() {
        return orderDelete;
    }

    public void setOrderDelete(Integer orderDelete) {
        this.orderDelete = orderDelete;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Flower> getFlowerList() {
        return flowerList;
    }

    public void setFlowerList(List<Flower> flowerList) {
        this.flowerList = flowerList;
    }
}
