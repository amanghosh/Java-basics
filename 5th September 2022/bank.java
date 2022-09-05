/*Write a Java Program to Create Account with 500 Rs Minimum Balance
Create  a Class Called LessBalanceException Which returns
the Statement that Says WithDraw Amount(_Rs) is Not Valid 
if the amount withdrawn is more than the balance.*/

package ex;

import java.util.Scanner;

class bank{
	
	static void checkbal(int balance) throws  LessBalanceException{
		
		if(balance < 500) {
			System.out.println("Withdraw amount is not valid");
		}
		else {
			System.out.println("Please take your cash");
			System.out.println("Your remianning account balance is "+balance);
		}
	}
	static int deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to deposit ");
		int amount = sc.nextInt();
		return amount;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int amount = bank.deposit();; 
		System.out.println("Enter the amount you want to withdraw");
		int withdraw = sc.nextInt();
		int balance = amount - withdraw;
		
		try {
			bank.checkbal(balance);
		}
		catch(LessBalanceException e){
			System.out.println(e.getMessage());
		}
	}
}