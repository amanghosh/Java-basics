package com.java.pack;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int n = 0;
		int num = 1;
		System.out.print("Enter number of  rows you want - ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println("");
		}
}
}