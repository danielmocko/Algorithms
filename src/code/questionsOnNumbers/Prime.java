package code.questionsOnNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime {
	public static void main (String [] args) throws NumberFormatException, IOException {
		System.out.println("Enter the number: ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		
		int counter=0;
		for(int i=1;i<=input;i++) {
			if(input%i==0) {
				counter++;
			}
		}
		if(counter==2)
			System.out.println("The Number "+String.valueOf(input)+" is the prime number" );
		else
			System.out.println("The Number "+String.valueOf(input)+" is NOT the prime number" );
		
	}
}
