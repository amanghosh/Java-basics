package com.java.pack;

import java.util.Scanner;

public class Multiplytable {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number whose multiplication table you want - ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter a number upto which you want the table to be - ");
		int n2 = sc.nextInt();
		
		for(int i=1; i<=n2;i++) {
			System.out.println(n1+" * "+i+" = "+n1*i);
		}
}
}