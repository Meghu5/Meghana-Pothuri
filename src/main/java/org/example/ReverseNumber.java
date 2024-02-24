package org.example;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int number = 969, reverse = 0 , temp=number;
        while(number != 0)   
        	{  
        	int remainder = number % 10;  
        	reverse = reverse * 10 + remainder;  
        	number = number/10;
                    }
        System.out.println("The reverse of the given number is: " + reverse);  
        	if(reverse==temp) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not Palindrome");
		}
	}
}
