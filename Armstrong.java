package com.java.pack;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number - ");
		int n = sc.nextInt();
		
		int sum = 0;
		int rem = 1;
		int n2= n;
		
		//loop to find out the cube of the digits of the numbers
		while(n2!=0) {
			rem = n2%10;
			sum += rem*rem*rem;
			n2 = n2/10;
		}
		//loop ends
		
	//checking if it is an Armstrong number
	if(sum==n) {
		System.out.println("It is an Armstrong number");
	}
	else {
		System.out.println("It is not an Armstrong number");
	}
}
}