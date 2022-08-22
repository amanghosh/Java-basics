package com.java.pack;

import java.util.Scanner;

public class reverse {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number - ");
		int n = sc.nextInt();
		int n2 = n;
		int reverse = 0;
		
		while(n2!=0) {
			reverse = reverse*10 + n2%10;
			n2 = n2/10;
		}
		
		System.out.print("The reverse of "+n+" is "+reverse);
}
}