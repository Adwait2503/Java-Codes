package com.te.spring.laptop;

public class Os {
	String brand;
	int gen;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setGen(int gen) {
		this.gen = gen;
	}

	public void osDetails() {
		System.out.println("The Os of the laptop is " + brand + " and it is " + gen + " generation");
	}
}
