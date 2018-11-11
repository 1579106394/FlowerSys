package com.flower.mapper;

import java.util.List;

import com.flower.pojo.Flower;
import com.flower.pojo.Orders;

public interface FlowerMapper {

	List<Flower> getFlowerList(Flower flower);

	void deleteFlower(String flwId);

	Flower getFlowerById(String flwId);

	void editFlower(Flower flower);

	void addFlower(Flower flower);

	Double getCountPrice(Orders order);

	List<Flower> getFlowerListByOrder(String orderId);
}
