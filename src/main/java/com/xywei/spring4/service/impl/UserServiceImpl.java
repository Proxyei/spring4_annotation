package com.xywei.spring4.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xywei.spring4.dao.UserDao;
import com.xywei.spring4.domain.User;
import com.xywei.spring4.service.UserService;

//@Service(value = "userService0001")
 @Service
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Autowired
//	@Resource
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
		System.out.println("启动容器==" + this);
	}

	public void destroyMethod() {
		System.out.println("销毁容器==" + this);
	}

	@Override
	public String toString() {
		return "UserServiceImpl [userDao=" + userDao + "]";
	}

}
