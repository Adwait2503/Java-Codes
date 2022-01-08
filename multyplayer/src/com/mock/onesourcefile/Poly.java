package com.mock.onesourcefile;

 interface Idev{
	public void run();
}

public class Poly extends Demo implements Idev {
	 
	
     public static void main(String[] args) {
		Demo d =new Poly();
		Idev i =new Poly();
		i.run();
		d.getA1();
		
		
		  
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
 class Demo {
	 private int a1 = 10 ;
	 private int a2 = 20 ;
	public int getA1() {
		return a1;
	}
	public void setA1(int a1) {
		this.a1 = a1;
	}
	public int getA2() {
		return a2;
	}
	public void setA2(int a2) {
		this.a2 = a2;
	}
	 
 }
 
