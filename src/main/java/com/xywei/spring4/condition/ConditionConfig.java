package com.xywei.spring4.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.xywei.spring4.domain.User;

@Import(ImportComponet.class)
@Configuration
public class ConditionConfig {

	@Conditional(LinuxCondition.class)
	@Bean
	public User userLinux() {
		return new User("linux", 1);
	}

	@Conditional(WindowsCondition.class)
	@Bean
	public User userWindows() {
		return new User("Windows", 2);
	}
}
