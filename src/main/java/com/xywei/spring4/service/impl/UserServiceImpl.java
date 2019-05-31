package com.xywei.spring4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.xywei.spring4.dao.UserDao;
import com.xywei.spring4.domain.User;
import com.xywei.spring4.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Autowired
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

	public void initMethod() {
		System.out.println("启动容器=="+this);
	}
	
	public void destroyMethod() {
		System.out.println("销毁容器=="+this);
	}
}
