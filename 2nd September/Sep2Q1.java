/*Write a java program to input 5 elements of an array and search
for a number whether it is present in an array or not.
If present print its position in the array*/

package array;

import java.util.Scanner;

public class Sep2Q1 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the elements of the array");
		//Taking array elements from the user
		for(int i = 0; i<5;i++) {
			
			arr[i] = sc.nextInt();
		}
		//taking the element user want to search in the array
		System.out.println("Enter the element you want to search: ");
		int num = sc.nextInt();
		
		boolean flag = false;
		
		//checking if the element is present inside the array
		for(int i = 0; i<5;i++) {
			
			if(arr[i] == num) {
				System.out.println("The element is present in the array and the position is "+i);
				flag = true;
				break;
			}
		}
		//if the element is not present 
		if(!flag) {
			System.out.println("The element is not present in the array");
		}
		
	}
}