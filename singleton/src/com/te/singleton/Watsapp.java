package com.te.singleton;

public class Watsapp {

	final static Watsapp watsapp =new Watsapp();

	private Watsapp() {

	}

//	static Watsapp helper() {
//		if (watsapp==null) {
//			watsapp=new Watsapp();
//			return watsapp;
//		}
//		return watsapp;
//	}

}
