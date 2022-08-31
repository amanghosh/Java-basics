/*. Write a program to create a class named Vehicle having protected instance variables
regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a
vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having
individual private instance variables routeNumber in Bus and manufacturerName in Car
and both of them having showData ( ) method showing all details of Bus and Car
respectively with content of the super class’s showData ( ) method.*/

package vehicle;

import java.util.Scanner;

public class maincar {
	
	public static void main(String args[]) {
		
		String regno,color,owner,manufacturer;
		int speed,route;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Bus reg no: ");
		regno=sc.nextLine();
		System.out.println("Enter Bus color: ");
		color=sc.nextLine();
		System.out.println("Enter Bus owner name: ");
		owner=sc.nextLine();
		System.out.println("Enter Bus speed: ");
		speed=sc.nextInt();
		System.out.println("Enter Bus route: ");
		route=sc.nextInt();
		Bus b=new Bus(regno,color,owner,speed,route);
		b.showData();
		System.out.println("Enter car reg no: ");
		regno=sc.nextLine();
		System.out.println("Enter car color: ");
		color=sc.nextLine();
		System.out.println("Enter Bus owner name: ");
		owner=sc.nextLine();
		System.out.println("Enter car speed: ");
		speed=sc.nextInt();
		System.out.println("Enter Bus manufacturer: ");
		manufacturer=sc.nextLine();
		Car c=new Car(regno,color,owner,speed,manufacturer);
		c.showData();
	}
}