/*Create a class named 'Rectangle' with two data members 'length' and 'breadth'
and two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used to initialize
length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle'
class with its constructor having a parameter for its side (suppose s) calling
the constructor of its parent class as 'super(s,s)'.

Print the area and perimeter of a rectangle and a square.*/


package oops2;

import java.util.Scanner;

public class areaSquare{
	public static void main(String ags[]){
		
		Scanner sc = new Scanner(System.in);
		
		Square s1 = new Square(5);
		
		System.out.print("Enter side of a sqaure: ");
		s1.side = sc.nextInt();
		System.out.println("The area of square is " +s1.getAreaSq());
		
		Rectangle r2 = new Rectangle(5,9);
		System.out.print("Enter the length of rectangle: ");
		r2.length = sc.nextInt();
		System.out.print("Enter the breadth of rectangle: ");
		r2.breadth = sc.nextInt();
		
		r2.area();
		r2.perimeter();
		
	}
}