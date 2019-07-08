package code.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Palindromic {
	public static void main (String [] args) throws IOException {
		System.out.println("Enter the Polindromic word:");
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine().toLowerCase();
		
		reverse2(input);
	}
	
	public static void reverse1(String polindromic) {
		String reverse = new StringBuilder(polindromic).reverse().toString();
		if(polindromic.equals(reverse)) {
			System.out.println("String is Polindromic");
		}else {
			System.out.println("String is NOT Polindromic");
		}
	}
	
	public static void reverse2(String input) {
		int i =0;
		int j = input.length()-1;
		
		char [] polindromic = input.toCharArray();
		
		boolean flag = true;
		while(flag) {
			if(i==input.length())
				break;
			
			if(polindromic[i]==polindromic[j]) {
				i++;
				j--;
			}
			else {
			 flag=false;
			}
		}
		
		if(flag==true) {
			System.out.println("String is Polindromic");
		}else {
			System.out.println("String is NOT Polindromic");
		}
	}
}
