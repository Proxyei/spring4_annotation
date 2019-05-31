package com.xywei.spring4.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xywei.spring4.dao.UserDao;
import com.xywei.spring4.dao.impl.UserDaoImpl;
import com.xywei.spring4.service.UserService;
import com.xywei.spring4.service.impl.UserServiceImpl;

@Configuration
public class AppConfiguration {

	// @Scope(value = "prototype")只销毁单例不销毁多例
	// name找到第一个就返回
	@Bean(name = { "userService" }, initMethod = "initMethod", destroyMethod = "destroyMethod")
	public UserService userService() {

		// 注入userDao方法一，serviceimpl使用autowire
		UserService userService = new UserServiceImpl();
		// 注入userDao方法二
		// UserServiceImpl userService = new UserServiceImpl();
		// userService.setUserDao(this.userDao());
		return userService;
	}

	@Bean(name = "userDao001", initMethod = "initMethod", destroyMethod = "destroyMethod")
	public UserDao userDao() {
		return new UserDaoImpl();
	}

}
