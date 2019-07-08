package code.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MisssingNumberInArray {

	public static void main (String [] args) throws NumberFormatException, IOException {
		System.out.println("Enter the length of array: ");
		BufferedReader bfLength = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.valueOf(bfLength.readLine());

		System.out.println("Enter the one missing number: ");
		BufferedReader bfMissing = new BufferedReader(new InputStreamReader(System.in));


		int missing = Integer.valueOf(bfMissing.readLine());

		int x [] = new int [length];
		int total =0;
		for (int i = 0; i < x.length; i++) {
			if(i!=missing) {
				x[i]=i;
				total+=i;
			}
			else {
				total +=i;
				continue;
			}
		}

		int sum = missingElement(x);
		total = total-sum;
		System.out.println("Missing elelemnt is: " + String.valueOf(total));


	}

	public static int missingElement(int [] x) {
		int sum=0;
		for(int i=0;i<x.length;i++) {
			sum+=x[i];
		}
		return sum;

	}


}
