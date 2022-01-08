package com.te.spring.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
		Salary bean = con.getBean(Salary.class);
		System.out.println(bean);
	}
}
