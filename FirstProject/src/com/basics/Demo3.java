package com.basics;



public class Demo3 {

	public static void main(String[] args) {
		// two dimension array
		int [][] a = new int [4][4];
		int temp=10;
		 for(int i=0;i<4;i++)
		 {
			 for(int j=0;j<4;j++)
			 {
				 a[i][j]=temp;
				 temp=temp+10;
				 System.out.print(a[i][j]+" ");
			 }
			 System.out.println();
			 
		 }

	}

}
