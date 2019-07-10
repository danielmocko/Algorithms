package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	public static void main (String [] args) throws NumberFormatException, IOException {
		
		System.out.println("Enter the number: ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		
		
		double fakt = factorial(input);
		System.out.println("Factorial: "+fakt);
		
	}
	public static double factorial(int input) {
		
		if(input==1)
			return 1;
		else
			return input * factorial(input-1);
	}
}
