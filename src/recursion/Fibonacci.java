package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
	public static void main (String [] args) throws NumberFormatException, IOException {
		
		System.out.println("Enter the Fibonacci series: ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		
		int result = fibonacci(input-1);
		System.out.println("Fibonacci series: " + result);
	}
	
	public static int fibonacci (int input) {

		if(input ==0 || input==1 )
			return input;
		else
			return (fibonacci(input-1) + fibonacci(input-2));
	}
}
