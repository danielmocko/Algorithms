package code.questionsOnNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeries {
	public static void main (String [] args) throws NumberFormatException, IOException{
		System.out.println("Enter the length for calculate fibonacci numbers");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(bf.readLine());
		
		calculateFibonacci(input);
	}
	
	public static void calculateFibonacci(int input) {
		int n1=0;
		int n2=1;
		int sum=1;
		int [] fibonacciArray = new int[input];
		for(int i=0;i<input;i++) {
			if(i==0 ) {
				fibonacciArray[i]=0;
			}else if(i==1) {
				fibonacciArray[i]=1;
			}
			else {
				sum=n1+n2;
				n1=n2;
				n2=sum;
				fibonacciArray[i]=sum;
			}
		}
		System.out.println("Fibonacci series :");
		for(int x :fibonacciArray)
			System.out.print(String.valueOf(x)+ " ");
	}
}
