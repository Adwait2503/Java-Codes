package com.te.employeeheirarchy;

public abstract class Developer extends Employee{

	public Developer(int eid, String name, double sal, String designation) {
		super(eid, name, sal, designation);
		// TODO Auto-generated constructor stub
	}
	abstract public void work();
	abstract public void earn();
}
