package com.xywei.spring4.dao.impl;

import org.springframework.stereotype.Repository;

import com.xywei.spring4.dao.UserDao;
import com.xywei.spring4.domain.User;

@Repository(value="dao001")
public class UserDaoImpl implements UserDao {

	@Override
	public User findUser() {
		return new User("初始值", 0);
	}

	public void initMethod() {
		System.out.println("启动容器==" + this);
	}

	public void destroyMethod() {
		System.out.println("销毁容器==" + this);
	}

}
