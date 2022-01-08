package com.te.spring.spring;

public class Laptop {

	Battery battery;
	Screen screen;
	HardDisk hardDisk1;
	HardDisk hardDisk2;

	public Laptop(Battery battery, Screen screen, HardDisk hardDisk1, HardDisk hardDisk2) {
		super();
		this.battery = battery;
		this.screen = screen;
		this.hardDisk1 = hardDisk1;
		this.hardDisk2 = hardDisk2;
	}

//	public void setBattery(Battery battery) {
//		this.battery = battery;
//	}
//
//	public void setScreen(Screen screen) {
//		this.screen = screen;
//	}
//
//	public void setHardDisk1(HardDisk hardDisk1) {
//		this.hardDisk1 = hardDisk1;
//	}
//
//	public void setHardDisk2(HardDisk hardDisk2) {
//		this.hardDisk2 = hardDisk2;
//	}

	@Override
	public String toString() {
		return "Laptop [battery=" + battery + ", screen=" + screen + ", hardDisk1=" + hardDisk1 + ", hardDisk2="
				+ hardDisk2 + "]";
	}

}
