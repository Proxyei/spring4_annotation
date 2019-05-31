package com.xywei.spring4.value;

import org.springframework.beans.factory.annotation.Value;

//@PropertySource("classpath:/com/xywei/spring4/value/person.properties")
// 错误写法，配置文件就应该配置在configuration类
public class Person {

	@Value("大佬")
	private String name;
	@Value("#{12*10}")
	private Integer age;
	// 为毛没注入进？？
	@Value("${person.address}")
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
