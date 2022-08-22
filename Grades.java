package com.java.pack;

public class Grades {
	public static void main(String args[]){
		
		int marks = 70;
		
		if(marks>=90){
			System.out.print("Your Grade is A+");
		}
		else if(marks>=80 && marks<90){
			System.out.print("Your Grade is A");
		}
		else if(marks>=70 && marks<80){
			System.out.print("Your Grade is B+");
		}
		else if(marks>=60 && marks<70){
			System.out.print("Your Grade is B");
		}
		else if(marks>=50 && marks<60){
			System.out.print("Your Grade is C");
		}
		else if(marks>=40 && marks<50){
			System.out.print("Your Grade is D");
		}
		else if(marks>=30 && marks<40){
			System.out.print("Your Grade is E");
		}
		else if(marks<30){
			System.out.print("Your Grade is F");
		}
		else{
			System.out.print("Error");
		}
	}
}