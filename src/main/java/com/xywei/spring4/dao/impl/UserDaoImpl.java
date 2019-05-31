package com.xywei.spring4.dao.impl;

import org.springframework.stereotype.Repository;

import com.xywei.spring4.dao.UserDao;
import com.xywei.spring4.domain.User;

@Repository
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

	private String version = "1";

	public UserDaoImpl() {
	}

	public UserDaoImpl(String version) {
		super();
		this.version = version;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "UserDaoImpl [version=" + version + "]";
	}

}
