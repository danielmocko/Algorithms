package code.questionsOnNumbers;

import java.io.BufferedReader;
import java.io.IOException;



public class Factorial {
	public static void main (String [] args) throws IOException {
		
		System.out.println("Enter a number:");
		BufferedReader bf = new BufferedReader(new java.io.InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		
		fact(input);
	}
	
	public static void fact(int number) {
		int factorial=1;
		for(int i=1;i<=number;i++) {
			factorial *=i;
		}
		
		System.out.println("Factorial:" + factorial);
	}

}
