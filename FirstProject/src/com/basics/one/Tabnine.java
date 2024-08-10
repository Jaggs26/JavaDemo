package com.basics.one;
import java.util.*;

// program to find factorial of number 
public class Tabnine{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		Integer number = scanner.nextInt();
		long factorial = 1;
		for(int i = 1; i <= number; i++)
		{
			factorial=factorial* i;
		}
		System.out.println("Factorial is " + factorial);
	
	scanner.close();
}}
