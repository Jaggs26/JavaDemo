package com.basics;

public class Demo2 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		for(int i=0;i<4;i++)
		{
			System.out.println(a[i]);
		}
		int [] x = new int [3];
		
		x[1]=100;
		x[2]=1000;
		for(int j:x) {
			System.out.println(j);
		}
		
	}

}
