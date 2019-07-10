package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Power {
	
	public static void main(String [] args) throws NumberFormatException, IOException {
		System.out.println("Enter the number: ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		
		System.out.println("Enter the number: ");
		BufferedReader bfPower = new BufferedReader(new InputStreamReader(System.in));
		int power = Integer.parseInt(bf.readLine());
		
		int result = power(input,power);
		System.out.println("Result: "+result);
		
		
	}
	
	public static int power(int input, int power) {
		if(power==0)
			return 1;
		else {
			return input*power(input,power-1);
		}
	}
}
