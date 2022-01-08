package com.te.spring.springbean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("It eats Meat");
	}

	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.println("It Roars");
	}

	@Override
	public boolean isPet() {
		// TODO Auto-generated method stub
		return false;
	}

}