package code.questionsOnNumbers;

import java.awt.SecondaryLoop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReminderOfTwoIntegers {
	public static void main (String [] args) throws NumberFormatException, IOException {
		System.out.println("Enter first integer");
		BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
		int firstInput = Integer.parseInt(bf1.readLine());
		
		System.out.println("Enter second integer");
		BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
		int secondInput = Integer.parseInt(bf2.readLine());
		
		int result =reminder(firstInput,secondInput);
		
		if(result>=0) {
			System.out.println("Reminder: "+String.valueOf(result));
		}else {
			System.out.println("Entered number must be greater than 0");
		}
		
	}
	public static int reminder(int firstInput, int secondInput) {
		
		if(secondInput !=0)
			return firstInput%secondInput;
		else
			return -1;
	}
}
