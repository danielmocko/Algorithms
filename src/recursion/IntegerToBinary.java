package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerToBinary {
	
	public static void main(String [] args) throws NumberFormatException, IOException {
		System.out.println("Enter the number: ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		
		int result = binary(input);
		
		System.out.println("The number " + input + "in binary code is: " + result);
	}
	
	public static int binary(int input) {
		int result = 0;
		
		if(input== 0)
			return 0;
		else
		{
			return input%2+10*binary(input/2);
		}
	}

}
