package com.te.spring.laptop;

public class Laptop {
	double cost;
	Battery battery;
	HardDisk hardDisk;
	Os os;
	Ram ram;

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Laptop(Battery battery, HardDisk hardDisk, Os os, Ram ram) {
		super();
		this.battery = battery;
		this.hardDisk = hardDisk;
		this.os = os;
		this.ram = ram;
	}

	public void laptop() {
		battery.batteryDetails();
		hardDisk.hdDetails();
		os.osDetails();
		ram.ramDetails();
		System.out.println("The Cost of the Laptop is " + cost);
	}
}
