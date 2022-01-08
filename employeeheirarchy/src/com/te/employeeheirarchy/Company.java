package com.te.employeeheirarchy;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeniorDeveloper seniorDeveloper = new SeniorDeveloper(1, "Rakshit", 25000, "Senior Developer");
		SeniorDeveloper seniorDeveloper2 = new SeniorDeveloper(2, "Romen", 20000, "Senior Developer");
		seniorDeveloper.driver(seniorDeveloper2);
	}

}
