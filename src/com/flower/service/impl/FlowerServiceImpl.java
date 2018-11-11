package com.flower.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flower.mapper.FlowerMapper;
import com.flower.pojo.Flower;
import com.flower.pojo.Orders;
import com.flower.service.FlowerService;

@Service
@Transactional
public class FlowerServiceImpl implements FlowerService {

	@Autowired
	private FlowerMapper flowerMapper;
	
	public List<Flower> getFlowerList(Flower flower) {
		return flowerMapper.getFlowerList(flower);
	}

	public void deleteFlower(String flwId) {
		flowerMapper.deleteFlower(flwId);
	}

	public Flower getFlowerById(String flwId) {
		return flowerMapper.getFlowerById(flwId);
	}

	public void editFlower(Flower flower) {
		flowerMapper.editFlower(flower);
	}

	public void addFlower(Flower flower) {
		flower.setFlwId(UUID.randomUUID().toString());
		flowerMapper.addFlower(flower);
	}

	public Double getCountPrice(Orders order) {
		return flowerMapper.getCountPrice(order);
	}

	public List<Flower> getFlowerListByOrder(String orderId) {
		return flowerMapper.getFlowerListByOrder(orderId);
	}
}
