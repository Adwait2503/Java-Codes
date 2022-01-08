package com.te.spring.laptop;

public class HardDisk {
	String brand;
	double size;

	public HardDisk(String brand, double size) {
		super();
		this.brand = brand;
		this.size = size;
	}

	public void hdDetails() {
		System.out.println("The Brand of the Hard Disk is " + brand + " and the size is " + size);
	}
}
