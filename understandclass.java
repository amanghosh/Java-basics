package com.java.pack;

import java.util.Scanner;

class Student {
String name;
int rollno;
int marks;
}

public class understandclass {
	public static void main(String args[]){
		
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of first student");
		s1.name=sc.nextLine();
		System.out.println("Enter the roll no of first student");
		s1.rollno=sc.nextInt();
		System.out.println("Enter the marks of first student");
		s1.marks=sc.nextInt();
		System.out.println("Enter the name of second student");
		s2.name=sc.nextLine();
		System.out.println("Enter the roll no of second student");
		s2.rollno=sc.nextInt();
		System.out.println("Enter the marks of second student");
		s2.marks=sc.nextInt();
		System.out.println("Enter the name of third student");
		s3.name=sc.nextLine();
		System.out.println("Enter the roll no of third student");
		s3.rollno=sc.nextInt();
		System.out.println("Enter the marks of third student");
		s3.marks=sc.nextInt();
		
		System.out.println(s1.name+" "+s1.rollno+" "+s1.marks);
		System.out.println(s2.name+" "+s2.rollno+" "+s2.marks);
		System.out.println(s3.name+" "+s3.rollno+" "+s3.marks);
}
}

