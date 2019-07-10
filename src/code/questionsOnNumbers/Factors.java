package code.questionsOnNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factors {

	public static void main (String [] args) throws NumberFormatException, IOException {
		
		System.out.println("Enter the number: ");
		BufferedReader bfInput = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bfInput.readLine());
		
		System.out.println("The Factors numbers of " +input);
		for(int i=1;i<=input;i++) 
			if(input%i==0)
				System.out.println(i);
	}	
}
