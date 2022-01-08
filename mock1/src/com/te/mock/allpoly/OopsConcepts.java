package com.te.mock.allpoly;

public abstract class OopsConcepts {

	private int id;

	public abstract void sample();

	public static int add(int num1, int num2) {
		System.out.println("From add(int,int) add= " + num1 + num2);
	}

	public static void add(double num1, double num2) {
		System.out.println("From add(double,double) add= " + num1 + num2);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OopsConcepts(int id) {
		super();
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(OopsConcepts.add(10, 21));

	}

}
