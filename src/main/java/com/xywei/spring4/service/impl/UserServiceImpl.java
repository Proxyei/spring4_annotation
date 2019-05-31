package com.xywei.spring4.service.impl;

import com.xywei.spring4.dao.UserDao;
import com.xywei.spring4.domain.User;
import com.xywei.spring4.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	@Override
	public User findUser() {
		return userDao.findUser();
	}

}
