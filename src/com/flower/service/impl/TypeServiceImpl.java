package com.flower.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flower.mapper.TypeMapper;
import com.flower.pojo.Type;
import com.flower.service.TypeService;

@Service
@Transactional
public class TypeServiceImpl implements TypeService {

	@Autowired
	private TypeMapper typeMapper;
	
	public List<Type> getTypeList() {
		return typeMapper.getTypeList();
	}

	public void deleteTypeById(String typeId) {
		typeMapper.deleteTypeById(typeId);
	}

	public Type getType(Type type) {
		return typeMapper.getType(type);
	}

	public void editType(Type type) {
		typeMapper.editType(type);
	}

	public void addType(Type type) {
		type.setTypeId(UUID.randomUUID().toString());
		type.setTypeNum(0);
		typeMapper.addType(type);
	}

	public Integer getTypeCount(Type type) {
		return typeMapper.getTypeCount(type);
	}
}
