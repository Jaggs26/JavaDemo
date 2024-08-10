package com.basics;

public class Deom6 {
	static {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deom6.m1();
			System.out.println("Apple");
			
		
	}
	static void m1() {
		System.out.println("This is a static method");
	}
	
static {
	System.out.println("A");
	// outsidde the main method ey call cheyagalam enka main method kanna first edey run avtadi 
	// stattic method ni only main lo call cheyagalam 
}
}
