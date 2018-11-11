package com.flower.mapper;

import java.util.List;

import com.flower.pojo.Type;

public interface TypeMapper {

	List<Type> getTypeList();

	void deleteTypeById(String typeId);

	Type getType(Type type);

	void editType(Type type);

	void addType(Type type);

	Integer getTypeCount(Type type);
}
