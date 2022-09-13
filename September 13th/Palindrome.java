package september13;

import java.util.*;

public class Palindrome
{
    public static void main(String args[])
    {
        String stringA, stringB = "";
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the string you want to check:");
        stringA = s.nextLine();
        
        int n = stringA.length();
        
        for(int i = n - 1; i >= 0; i--)
        {
            stringB = stringB + stringA.charAt(i);
        }
        if(stringA.equalsIgnoreCase(stringB))
        {
            System.out.println("The string is a palindrome string.");
        }
        else
        {
            System.out.println("The string is not a palindrome string.");
        }
    }
}