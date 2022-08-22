package com.java.pack;

public class RootofQrEq {
	public static void main(String args[]){
		
		int a = 1;
		int b = 5;
		int c = 1;
		int d = 0;
		d = (b*b) - (4*a*c);
		
		//checking if discriminant is positive in which case roots are real
		if(d>0) {
			System.out.print("The Roots are real");
		}
		//checking if discriminant is equal to zero in which case roots are real
		else if(d==0){
			System.out.print("The Roots are equal");
		}
		//checking if discriminant is negative in which case roots are imaginary
		else if(d<0){
			System.out.print("The Roots are imaginary");
		}
	}	
}
