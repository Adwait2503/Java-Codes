package com.te.employeeheirarchy;

public class SeniorDeveloper extends Developer {

	public void driver(Developer developer) {
		developer.work();
		developer.earn();
	}

	public SeniorDeveloper(int eid, String name, double sal, String designation) {
		super(eid, name, sal, designation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("They work on Big Project");
	}

	@Override
	public void earn() {
		// TODO Auto-generated method stub
		System.out.println("They earn a lot");
	}

}
