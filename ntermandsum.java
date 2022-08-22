package com.java.pack;

import java.util.Scanner;

public class ntermandsum {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number - ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			System.out.println(i+" ");
			sum += i;
		}
		System.out.println(sum+" is the sum of "+n+" numbers");
}
}