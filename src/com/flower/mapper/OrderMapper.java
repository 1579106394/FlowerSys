package com.flower.mapper;

import java.util.List;

import com.flower.pojo.Orders;
import com.flower.pojo.User;

public interface OrderMapper {

	List<Orders> getOrderList(User user);

	void deleteOrder(String orderId);

	void addOrder(Orders order);

	void addOrderFlower(String orderId, String id);
}
