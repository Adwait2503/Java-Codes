package com.te.spring.springbean;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("It Eats Pedigree");
	}

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("It Barks");
	}

	@Override
	public boolean isPet() {
		// TODO Auto-generated method stub
		return true;
	}

}