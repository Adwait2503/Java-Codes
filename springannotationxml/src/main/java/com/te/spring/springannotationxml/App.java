package com.te.spring.springannotationxml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext();
		Salary bean = cont.getBean(Salary.class);
		System.out.println(bean);
	}
}
