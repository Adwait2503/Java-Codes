package com.te.spring.springbean;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("It Eats Cat Food");
	}

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("It Meaows");
	}

	@Override
	public boolean isPet() {
		// TODO Auto-generated method stub
		return true;
	}

}