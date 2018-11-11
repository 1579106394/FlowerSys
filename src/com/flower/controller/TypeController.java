package com.flower.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flower.pojo.Type;
import com.flower.service.FlowerService;
import com.flower.service.TypeService;

@Controller
public class TypeController {
	
	@Autowired
	private TypeService typeService;
	
	/**
	 * 获取品种列表
	 * @param model
	 * @return
	 */
	@RequestMapping("type/typeList.html")
	public String typeList(Model model) {
		
		List<Type> typeList = typeService.getTypeList();
		
		for (Type type : typeList) {
			Integer num = typeService.getTypeCount(type);
			type.setTypeNum(num == null ? 0 : num);
			editType(type);
		}
		
		model.addAttribute("typeList", typeList);
		
		return "category/list";
	}
	
	/**
	 * 根据id删除品种
	 * @param typeId
	 * @return
	 */
	@RequestMapping("type/deleteType/{typeId}.html")
	public String deleteType(@PathVariable String typeId) {
		
		typeService.deleteTypeById(typeId);
		
		
		return "redirect:/type/typeList.html";
	}
	
	/**
	 * 查询品种，跳转到编辑页面
	 * @param typeId
	 * @param model
	 * @return
	 */
	@RequestMapping("type/toEditType/{typeId}.html")
	public String toEdit(@PathVariable String typeId, Model model) {
		
		Type type = new Type();
		type.setTypeId(typeId);
		
		Type t  = typeService.getType(type);
		
		model.addAttribute("type", t);
		
		return "category/edit";
	}
	
	/**
	 * 编辑品种
	 * @param type
	 * @return
	 */
	@RequestMapping("type/editType.html")
	public String editType(Type type) {
		
		typeService.editType(type);
		
		return "redirect:/type/typeList.html"; 
	}
	
	/**
	 * 新增品种
	 * @param type
	 * @return
	 */
	@RequestMapping("type/addType.html")
	public String addType(Type type) {
		
		typeService.addType(type);
		
		return "redirect:/type/typeList.html";
	}
	
	
}
