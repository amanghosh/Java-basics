package com.java.pack;

import java.util.Scanner;

public class n1tothepowern2 {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number - ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter a number - ");
		int n2 = sc.nextInt();
		int ans = 1;
		
		for(int i=0;i<n2;i++) {
			ans = ans*n1;
		}
		System.out.print(ans+" Is the value of "+n1+" to the power "+n2);
}
}