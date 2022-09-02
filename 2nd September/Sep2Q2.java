/*2. Write a program to print the roll number and average marks of 8 students
in three subjects (each out of 100). The marks are entered by user*/

package array;

import java.util.Scanner;

public class Sep2Q2{
	int sub1,sub2,sub3,rollno;
	
	Sep2Q2(int s1, int s2, int s3,int rn){
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		rollno = rn;
	}
	
	public static void main(String[] args) {
		Sep2Q2 arr[]=new Sep2Q2[8];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<8;i++)
		{
			System.out.println("Enter the roll no of student no. "+(i+1));
			int rn=sc.nextInt();
			
			System.out.println("Enter the marks of the first subject of student no. "+(i+1));
			int s1=sc.nextInt();
			
			System.out.println("Enter the marks of the second subject of student no. "+(i+1));
			int s2=sc.nextInt();
			
			System.out.println("Enter the marks of the second subject of student no. "+(i+1));
			int s3=sc.nextInt();
			
			arr[i]=new Sep2Q2(s1,s2,s3,rn);
		}
		
		/*Display*/
		for(int i=0;i<8;i++)
		{
			int avg = (arr[i].sub1 + arr[i].sub2 + arr[i].sub3)/3;
			System.out.println("Student with roll no. "+arr[i].rollno+" has got an average of "+avg+" marks in 3 subjects combine");
		}
		
	}
}