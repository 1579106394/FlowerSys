package com.flower.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flower.mapper.OrderMapper;
import com.flower.pojo.Orders;
import com.flower.pojo.User;
import com.flower.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;
	
	public List<Orders> getOrderList(User user) {
		return orderMapper.getOrderList(user);
	}

	public void deleteOrder(String orderId) {
		orderMapper.deleteOrder(orderId);
	}

	public void addOrder(String[] ids, User user) {
		
		Orders order = new Orders();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String date = sdf.format(new Date());
		order.setOrderId(UUID.randomUUID().toString());
		order.setOrderCreatedTime(date);
		order.setUser(user);
		
		orderMapper.addOrder(order);
		for (String id : ids) {
			orderMapper.addOrderFlower(order.getOrderId(), id);
		}
		
	}

	public void addOrder(String flwId, User user) {
		Orders order = new Orders();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String date = sdf.format(new Date());
		order.setOrderId(UUID.randomUUID().toString());
		order.setOrderCreatedTime(date);
		order.setUser(user);
		
		orderMapper.addOrder(order);
		orderMapper.addOrderFlower(order.getOrderId(), flwId);
	}
}
