package com.xywei.spring4.value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource(value = { "classpath:/com/xywei/spring4/value/person.properties" })
@Configuration
public class Config_Value {

	@Autowired
	Environment en;
	//也没注入进来
	@Value("${person.address}")
	String address;

	@Bean
	public Person person() {
		System.out.println("person.address>>>>>>>>>>" + address);
		System.out.println(en.getProperty("person.address"));
		return new Person();
	}

}
