package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumDigits {
	public static void main(String [] args) throws NumberFormatException, IOException {
		
		System.out.println("Enter the number: ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		
		int result = sum(input);
		System.out.println("Sum of digits "+ input+ " is " +result);
		
	}
	
	public static int sum(int input) {
		if(input==0)
			return 0;
		else 
			return input%10+sum(input/10);
	}
	
	
}
