package com.java.pack;

import java.util.Scanner;

public class HCF {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int n1, n2, hcf = 0;
		
		System.out.print("Enter the first number");
		n1 = sc.nextInt();
		System.out.print("Enter the second number");
		n2 = sc.nextInt();
		
		for(int i = 1; i <= n1 || i<=n2; i++) {
			if(n1%i == 0 && n2%i == 0) {
				hcf = i;
			}
		}
		System.out.print("HCF of "+n1+" and "+n2+" is "+hcf);
}
}