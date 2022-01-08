package com.te.spring.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MyClass {
	public static void main(String[] args) {
		// ConfigurableApplicationContext con = new
		// AnnotationConfigApplicationContext(BeanConfig.class);
		AbstractApplicationContext con = new AnnotationConfigApplicationContext(BeanConfig.class);
		con.registerShutdownHook();
		Demo bean = con.getBean(Demo.class);
		bean.name();
		System.out.println(bean.hashCode());
	}
}
