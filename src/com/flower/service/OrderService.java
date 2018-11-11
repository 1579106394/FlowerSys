package com.flower.service;

import java.util.List;

import com.flower.pojo.Orders;
import com.flower.pojo.User;

public interface OrderService {

	// 新增订单
	List<Orders> getOrderList(User user);

	// 删除订单
	void deleteOrder(String orderId);

	// 批量下单
	void addOrder(String[] ids, User user);

	// 单个下单
	void addOrder(String flwId, User user);
}
