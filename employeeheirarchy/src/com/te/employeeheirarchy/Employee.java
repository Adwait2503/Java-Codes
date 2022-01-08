package com.te.employeeheirarchy;

public class Employee {
	int eid;
	String name;
	double sal;
	String designation;

	public Employee(int eid, String name, double sal, String designation) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
		this.designation = designation;
	}

	//public void driver(Employee employee) {
	//}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
