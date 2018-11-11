package com.flower.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flower.pojo.Flower;
import com.flower.pojo.Orders;
import com.flower.pojo.User;
import com.flower.service.FlowerService;
import com.flower.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	@Autowired
	private FlowerService flowerService;
	
	/**
	 * 订单列表
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("/order/orderList.html")
	public String orderList(Model model, HttpSession session) {
		
		User user = (User) session.getAttribute("user");
		
		List<Orders> orderList = orderService.getOrderList(user);
		for (Orders orders : orderList) {
			Double price = flowerService.getCountPrice(orders);
			orders.setOrderPrice(price);
		}
		
		
		model.addAttribute("orderList", orderList);
		
		return "order/list";
	}
	
	/**
	 * 根据id删除订单
	 * @param orderId
	 * @return
	 */
	@RequestMapping("order/deleteOrder/{orderId}.html")
	public String deleteOrder(@PathVariable String orderId) {
		
		orderService.deleteOrder(orderId);
		
		return "redirect:/order/orderList.html";
	}
	
	@RequestMapping("order/getFlowerList/{orderId}.html")
	public String getFlowerList(@PathVariable String orderId, Model model) {
		
		List<Flower> flowerList = flowerService.getFlowerListByOrder(orderId);
		
		model.addAttribute("flowerList", flowerList);
		
		return "order/flowerList";
	}
	
	/**
	 * 批量下单
	 * @param ids
	 * @param session
	 * @return
	 */
	@RequestMapping("order/addOrderList.html")
	public String addOrderList(String[] ids, HttpSession session) {
		
		User user = (User) session.getAttribute("user");
		
		orderService.addOrder(ids, user);
		
		return "redirect:/order/orderList.html";
	}
	
	/**
	 * 单个下单
	 * @param flwId
	 * @param session
	 * @return
	 */
	@RequestMapping("order/addOrder/{flwId}.html")
	public String addOrder(@PathVariable String flwId, HttpSession session) {
		
		User user = (User) session.getAttribute("user");
		
		orderService.addOrder(flwId, user);
		
		return "redirect:/order/orderList.html";
	}
	
}
