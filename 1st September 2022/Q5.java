/* Write a program to accept value of apple sales for each day of the week (using array of
type float) and then, calculate the average sale of the week.*/

package array;

import java.util.Scanner;

public class Q5{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Float arr[] = new Float[7];
		float sum = 0;
		float avg = 0;
		
		System.out.println("Enter the apple sales for each day: ");
		
		for(int i = 0; i < 7; i++) {
			
			
			//reading array elements from the user
			arr[i]=sc.nextFloat();
			sum += arr[i];
		}
		
		System.out.println("The average sales of each day is: "+sum/7);
		
		
		
		
	}
}