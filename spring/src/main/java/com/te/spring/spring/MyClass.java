package com.te.spring.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClass {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		Laptop bean = con.getBean(Laptop.class);
		System.out.println(bean);
	}
}
