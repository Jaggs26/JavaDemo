package com.basics.three;
 
 
//constructor:
// it is a method same name as class name
//it is executed when object is created
//it is used to set default values
//it won't return anything ...void
public class SmallBox {
	int length=30;
	int width=40;
 
	
	  SmallBox(){ this.length=50; this.width=50; }
	
	
	 SmallBox(int length,int width){
		 this.length=length;
		this.width=width;
		System.out.println("Area :"+(length+width));
	 }
	
	void calculateArea() {
		System.out.println("Area :"+(length+width));
	}
	void calculateArea(int length, int width) {
		System.out.println("Area :"+(length+width));
	}
}
 

