package com.te.spring.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.spring.lifecycle.Test;
import com.te.spring.springbean.config.Config;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
		Pet pet = con.getBean(Pet.class);
		pet.doThings();
		Test test = con.getBean(Test.class);
		System.out.println(test);
	}
}
