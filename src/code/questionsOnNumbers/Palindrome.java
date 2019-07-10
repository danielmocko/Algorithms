package code.questionsOnNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
	public static void main (String [] args) throws NumberFormatException, IOException {
		
		System.out.println("Enter the number : ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		int palindrome=0;
		int remainder=0;
		int num = input;
		
		while(num!=0) {
			remainder = num%10;
			palindrome = palindrome*10+remainder;
			num/=10;
		}
		
		if(input==palindrome)
			System.out.printf("The number "+ input+" is a palindrome number");
		else
			System.out.printf("The number "+ input+" is NOT palindrome number ");
		
		
		
		
		
	}
}
