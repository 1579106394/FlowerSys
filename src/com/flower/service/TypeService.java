package com.flower.service;

import java.util.List;

import com.flower.pojo.Type;

public interface TypeService {

	// 获取品种列表
	List<Type> getTypeList();

	// 根据id删除品种
	void deleteTypeById(String typeId);

	// 获取品种
	Type getType(Type type);

	// 编辑品种
	void editType(Type type);

	// 新增品种
	void addType(Type type);

	// 获取品种数量
	Integer getTypeCount(Type type);
}
