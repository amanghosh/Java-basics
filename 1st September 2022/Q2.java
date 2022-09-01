/*WAP to input an array having 3 rows and 3 columns of type String.*/

package array;

import java.util.Scanner;

public class Q2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String arr[][] = new String[3][3];
		
		System.out.println("Enter the elements of the array: ");
		
		for(int i = 0; i <3; i++) {
			
			for(int j = 0; j <3; j++){
				//reading array elements from the user
				arr[i][j]=sc.next();
			}
		}
		
		System.out.println("Array elements are: ");
		
		for(int i = 0; i <3; i++) {
			
			for(int j = 0; j <3; j++){
				//printing array elements
				System.out.println(arr[i][j]+" ");
			}
		}
		
	}
}