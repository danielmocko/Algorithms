package code.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingWordsInString {
	
	public static void main(String [] args) throws IOException {
		System.out.println("Enter the sentence: ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		char [] input = bf.readLine().toCharArray();
		int counter = 0;
		
		for (char c : input) {
			if(c ==' ') { counter ++; }
		}
		System.out.println("Nuber of words in input string is "+counter);
	}
}
