package com.xywei.spring4.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xywei.spring4.dao.UserDao;
import com.xywei.spring4.dao.impl.UserDaoImpl;
import com.xywei.spring4.service.UserService;
import com.xywei.spring4.service.impl.UserServiceImpl;

@Configuration
public class AppConfiguration {

	@Bean
	public UserService userService() {
		//TODO 如果不用autowire如何把dao注入到service？
		UserServiceImpl userService = new UserServiceImpl();
		userService.setUserDao(this.userDao());
		return userService;
	}

	@Bean
	public UserDao userDao() {
		return new UserDaoImpl();
	}

}
