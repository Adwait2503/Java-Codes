package com.te.mock.allpoly;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World.";
		String rStr = "";
		System.out.println(str);
		for (int i = str.length()-1; i >=0; i--) {
			char ch = str.charAt(i);
			rStr = rStr + ch;
		}
		System.out.println(rStr);
	}

}
