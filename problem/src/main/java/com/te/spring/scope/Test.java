package com.te.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext content = new ClassPathXmlApplicationContext("configuration.xml");
		Dremo dremo = content.getBean(Dremo.class);
		System.out.println(dremo);
		Dremo dremo1 = content.getBean(Dremo.class);
		System.out.println(dremo1);
	}

}
