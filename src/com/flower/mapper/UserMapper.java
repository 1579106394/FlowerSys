package com.flower.mapper;

import com.flower.pojo.User;

public interface UserMapper {

	User getUserByUsername(User user);

	void insertUser(User user);
}
