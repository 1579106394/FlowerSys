package com.flower.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flower.pojo.Flower;
import com.flower.pojo.Type;
import com.flower.service.FlowerService;
import com.flower.service.TypeService;

@Controller
public class FlowerController {
	
	@Autowired
	private FlowerService flowerService;
	@Autowired
	private TypeService typeService;
	
	/**
	 * 获取花卉列表
	 * @param model
	 * @param flower
	 * @return
	 */
	@RequestMapping("flower/flowerList.html")
	public String flowerList(Model model, Flower flower) {
		
		List<Flower> flowerList = flowerService.getFlowerList(flower);
		
		List<Type> typeList = typeService.getTypeList();
		
		model.addAttribute("flowerList", flowerList);
		model.addAttribute("typeList", typeList);
		model.addAttribute("flower", flower);
		
		return "product/list";
	}
	
	/**
	 * 根据id删除花卉
	 * @param flwId
	 * @return
	 */
	@RequestMapping("flower/deleteFlower/{flwId}.html")
	public String deleteFlower(@PathVariable String flwId) {
		
		flowerService.deleteFlower(flwId);
		
		return "redirect:/flower/flowerList.html";
	}
	
	/**
	 * 根据id查询花卉，跳转到编辑界面并回显
	 * @param flwId
	 * @param model
	 * @return
	 */
	@RequestMapping("flower/toEditFlower/{flwId}.html")
	public String toEditFlower(@PathVariable String flwId, Model model) {
		
		
		Flower flower = flowerService.getFlowerById(flwId);
		
		List<Type> typeList = typeService.getTypeList();
		
		model.addAttribute("flower", flower);
		model.addAttribute("typeList", typeList);
		
		return "product/edit";
	}
	
	/**
	 * 查询花卉品种，跳转到添加界面
	 * @param model
	 * @return
	 */
	@RequestMapping("flower/toAdd.html")
	public String toAdd(Model model) {
		
		List<Type> typeList = typeService.getTypeList();
		
		model.addAttribute("typeList", typeList);
		
		return "product/add";
	}
	
	/**
	 * 编辑花卉
	 * @param flower
	 * @return
	 */
	@RequestMapping("flower/editFlower.html")
	public String editFlower(Flower flower) {
		
		flowerService.editFlower(flower);
		
		return "redirect:/flower/flowerList.html";
	}
	
	/**
	 * 添加花卉
	 * @param flower
	 * @return
	 */
	@RequestMapping("flower/addFlower.html")
	public String addFlower(Flower flower) {
		
		flowerService.addFlower(flower);
		
		return "redirect:/flower/flowerList.html";
	}
	
}
