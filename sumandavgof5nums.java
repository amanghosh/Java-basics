package com.java.pack;

import java.util.Scanner;

public class sumandavgof5nums {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the first number - ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter the second number - ");
		int n2 = sc.nextInt();
		
		System.out.print("Enter third number - ");
		int n3 = sc.nextInt();
		
		System.out.print("Enter forth number - ");
		int n4 = sc.nextInt();
		
		System.out.print("Enter fifth number - ");
		int n5 = sc.nextInt();
		
		int sum = n1+n2+n3+n4+n5;
		float avg = sum/5f;
		
		
		System.out.println(sum+" is the sum of all numbers");
		System.out.println(avg+" is the average of all numbers");
}
}