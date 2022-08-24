package com.java.pack;

import java.util.Scanner;

public class Multiplywithoutx{
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		int a;
		int b;
		int product = 0;
		System.out.print("Enter first number: ");
		a = sc.nextInt();
		System.out.print("Enter second number: ");
		b = sc.nextInt();
		
		for(int i = 0; i < b; i++) {
			product = product+a;
		}
		System.out.print("Product of two numbers you gave is: "+product);
	}
}