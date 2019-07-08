package code.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Anagrams {
	
	public static void main(String [] args) throws IOException {
		System.out.println("Enter the first anagram");
		BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));
		String firstInput = bf1.readLine();
		
		System.out.println("Enter the second anagram");
		BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
	
		String seconInput = bf2.readLine();
		
		
		char [] sort1 = firstInput.toCharArray();
		Arrays.sort(sort1);
		char [] sort2 = seconInput.toCharArray();
		Arrays.sort(sort2);
		
		//firstInput =reverse(firstInput);
		
		if(Arrays.equals(sort1, sort2)) {
				System.out.println("The words is anagram");
		}
	
	
	
	}
	
	public static String reverse(String anagram) {
		int i= anagram.length();
		String str = "";
		while(i>0) {
			str +=anagram.charAt(i-1);
			i--;
		}
		
		return str;
	}
	
}
