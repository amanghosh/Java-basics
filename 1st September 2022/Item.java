package array;

import java.util.Scanner;

public class Item {
	
	int code,price;
	
	Item(int c,int p)
	{
		code=c;
		price=p;
	}
	
	
	public static void main(String args[])
	{
		Item it[]=new Item[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the code for element no. "+(i+1));
			int co=sc.nextInt();
			
			System.out.println("enter the price for element no. "+(i+1));
			int pr=sc.nextInt();
			
			it[i]=new Item(co,pr);
		}
		
		/*Display*/
		int sum=0;
		for(int i=0;i<5;i++)
		{
			System.out.println(it[i].code+" "+it[i].price);
			sum=sum+it[i].price;
		}
		
		System.out.println(sum);
		
		
	}
}