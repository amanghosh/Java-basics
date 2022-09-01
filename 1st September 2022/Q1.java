/*1. WAP to input an array having 5 strings and display them.*/

package array;

import java.util.Scanner;

public class Q1{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String arr[] = new String[5];
		
		System.out.println("Enter the elements of the array: ");
		
		for(int i = 0; i <5; i++) {
			
			//reading array elements from the user
			arr[i]=sc.next();
		}
		
		System.out.println("Array elements are: ");
		
		for(int i = 0; i <5; i++) {
			
			//printing array elements
			System.out.println(arr[i]+" ");
		}
		
	}
}