package com.flower.service;

import com.flower.pojo.User;

public interface UserService {

	// 根据用户名查询用户
	User getUserByUsername(User user);

	//注册
	void insertUser(User user);
}
