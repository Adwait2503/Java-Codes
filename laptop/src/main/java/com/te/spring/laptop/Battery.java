package com.te.spring.laptop;

public class Battery {
	String brand;
	double volts;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setVolts(double volts) {
		this.volts = volts;
	}

	public void batteryDetails() {
		System.out.println("The Brand of the battery is " + brand + " and it is " + volts + " volts");
	}
}
