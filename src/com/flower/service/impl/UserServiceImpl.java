package com.flower.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.flower.mapper.UserMapper;
import com.flower.pojo.User;
import com.flower.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User getUserByUsername(User user) {
		return userMapper.getUserByUsername(user);
	}

	public void insertUser(User user) {
		userMapper.insertUser(user);
		
	}
}
