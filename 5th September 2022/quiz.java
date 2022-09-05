/*Consider a Quiz Management System, where a user needs to answer 5 questions. 
If any of the answer is wrong, throw an exception “NotCorrectException”. 
If the answer is correct give a message “good! The answer is correct”.*/

package ex;

import java.util.Scanner;

class quiz{
	
	static void checkAns(int a1, int a2, int a3, int a4, int a5) throws NotCorrectException {
		
		if(a1 == 3 && a2 == 3 && a3 == 2 && a4 == 4 && a5 == 4) {
			System.out.println("Good! All the answers are correct");
		}
		else {
			System.out.println("All the answers are not correct");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Who is the President of our Country? \n1. Narendra Modi \n2. Ram Nath Kovind \n3. Droupadi Murmu \n4. Arvind Kejrival");
		System.out.println("Enter your choice");
		int ans1 = sc.nextInt();
		
		System.out.println("Who is the Prime Minister of our Country? \n1. Amit Shah \n2. Rahul Gandhi \n3. Narendra Modi \n4. Arvind Kejrival");
		System.out.println("Enter your choice");
		int ans2 = sc.nextInt();
		
		System.out.println("Who won Yesterday's India VS Pakistan match? \n1. India \n2. Pakistan ");
		System.out.println("Enter your choice");
		int ans3 = sc.nextInt();
		
		System.out.println("Who is the President of USA? \n1. Donald Trump \n2. Barak Obama \n3. Hunter Biden  \n4. Joe Biden");
		System.out.println("Enter your choice");
		int ans4 = sc.nextInt();
		
		System.out.println("Who is the President of our UK? \n1. Donald Trump \n2. Barak Obama \n3. Hunter Biden \n4. None of the Above");
		System.out.println("Enter your choice");
		int ans5 = sc.nextInt();
		
		
		try {
			quiz.checkAns(ans1,ans2,ans3,ans4,ans5);
		}
		catch(NotCorrectException e) {
			System.out.println(e.getMessage());
		}
			
	}
}

