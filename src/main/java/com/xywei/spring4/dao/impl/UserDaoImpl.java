package com.xywei.spring4.dao.impl;

import com.xywei.spring4.dao.UserDao;
import com.xywei.spring4.domain.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User findUser() {
		return new User("初始值", 0);
	}

}
