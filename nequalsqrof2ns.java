package com.java.pack;

import java.util.Scanner;

public class nequalsqrof2ns{
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		int a;
		boolean temp = false;
		int i;
		int j = 0;
		
		System.out.print("Enter a number: ");
		a = sc.nextInt();
		
		for(i = 1; i<=a;i++) {
			for(j = 1; j<=a; j++) {
				
				if(i*i + j*j == a) {
					temp = true;
					break;
				}
				else {
					//System.out.print("Yes");
				}
			}
			if(temp){
				break;
			}
		}
		if(temp) {
			System.out.println("Yes it is a sum of two square numbers and the numbers are "+i+" and "+j);
		}
		else {
			System.out.print("False");
		}
	}
}