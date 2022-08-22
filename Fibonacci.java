package com.java.pack;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int fib;
		int i = 1;
		int n1, n2 = 0;
		
		System.out.print("Enter the first number of the series");
		n1 = sc.nextInt();
		System.out.print("Enter the first number of the series");
		n2 = sc.nextInt();
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		do{
			fib = n1+n2;
			n1 = n2;
			n2 = fib;
			System.out.print(fib+" ");
			i++;
		}while(i<8);
			
}
}