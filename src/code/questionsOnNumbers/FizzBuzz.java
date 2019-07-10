package code.questionsOnNumbers;

import java.io.BufferedReader;
import java.io.IOException;


public class FizzBuzz {

	public static void main (String [] args) throws NumberFormatException, IOException {

		for(int i=1;i<101;i++) {

			if(i%3==0 && i%5==0)
				System.out.println("FizzBuzz: "+i);
			else if(i%3==0)
				System.out.println("Fizz: "+i);
			else if(i%5==0)
				System.out.println("Buzz: "+i);
		}
	}
}
