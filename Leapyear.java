package com.java.pack;

public class Leapyear {
	public static void main(String args[]){
		
		int year = 2017;
		
		if(year%4==0){
			System.out.print(year+" is a Leap Year");
		}
		else {
			System.out.print(year+" is a not Leap Year");
		}
	}
}
