package com.flower.service;

import java.util.List;

import com.flower.pojo.Flower;
import com.flower.pojo.Orders;

public interface FlowerService {

	// 查询花卉列表
	List<Flower> getFlowerList(Flower flower);

	// 删除花卉
	void deleteFlower(String flwId);

	// 根据id查询花卉
	Flower getFlowerById(String flwId);

	// 编辑花卉
	void editFlower(Flower flower);

	// 新增花卉
	void addFlower(Flower flower);

	// 查询订单价格
	Double getCountPrice(Orders order);

	// 查询这个order的花卉列表
	List<Flower> getFlowerListByOrder(String orderId);
}
