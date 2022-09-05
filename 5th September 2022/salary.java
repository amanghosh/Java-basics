/*WAP to input the salary of an employee and if the salary
is not in the range of 10,000 to 20,000 an invalid salary 
exception should be thrown*/

package ex;

import java.util.Scanner;

class salary{	
	static void validate(int sal) throws InvalidSalaryException {
				if(sal < 10000 || sal > 20000) {
					throw new InvalidSalaryException("salary is invalid");
				}
				else {
					System.out.println("Salary is valid");
				}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sal;
		
		System.out.println("Enter your salary");
		sal = sc.nextInt();
		
		try {
			salary.validate(sal);
		}
		catch(InvalidSalaryException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
