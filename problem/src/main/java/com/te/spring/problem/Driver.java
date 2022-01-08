package com.te.spring.problem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
		Car car = context.getBean(Car.class);
		car.move();
//		Engine engine = context.getBean(Engine.class);
//		engine.start();
	}

}