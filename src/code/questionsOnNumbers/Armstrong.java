package code.questionsOnNumbers;

import java.io.BufferedReader;
import java.io.IOException;



public class Armstrong {
	public static void main (String [] args) throws NumberFormatException, IOException {
		System.out.println("Enter the number:");
		BufferedReader bf = new BufferedReader(new java.io.InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		int c=input;
		int counter=0;
		int digit =1;
		int sum=0;
		int mtp=1;
		
		while(c!=0) {
			c=c/10;
			counter++;
		}
		c=input;
		
		while(input!=0) {
			digit=input%10;
			for(int i=0;i<counter;i++) {
				mtp*=digit;
			}
			sum+=mtp;
			mtp=1;
			input=input/10;

		}
		if(c==sum)
			System.out.println("Entered number is an Armstrong Number ");
		else
			System.out.println("Entered number is NOT an Armstrong Number ");
	}
}
