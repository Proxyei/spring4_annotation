package com.xywei.spring4.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.xywei.spring4.controller.UserController;
import com.xywei.spring4.dao.UserDao;
import com.xywei.spring4.dao.impl.UserDaoImpl;
import com.xywei.spring4.service.UserService;
import com.xywei.spring4.service.impl.UserServiceImpl;

@Configuration
// @ComponentScan(value = "com.xywei.spring4")
// @ComponentScan(basePackages = "com.xywei.spring4")
// 注解类型,只扫描Repository
//
// @ComponentScan(value = "com.xywei.spring4", useDefaultFilters = false,
// includeFilters = {
// @Filter(type = FilterType.ANNOTATION, classes = { Repository.class }),
// @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = { UserController.class
// }) })
@ComponentScan(value = "com.xywei.spring4", useDefaultFilters = false, includeFilters = {
		@Filter(type = FilterType.CUSTOM, classes = { CustomComponentScanFilter.class }) })
public class AppConfiguration {

	// @Scope(value = "prototype")只销毁单例不销毁多例
	// name找到第一个就返回
	// @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
	public UserService userService() {

		// 注入userDao方法一，serviceimpl使用autowire
		UserService userService = new UserServiceImpl();
		// 注入userDao方法二
		// UserServiceImpl userService = new UserServiceImpl();
		// userService.setUserDao(this.userDao());
		return userService;
	}

	// @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
	public UserDao userDao() {
		return new UserDaoImpl();
	}

}
