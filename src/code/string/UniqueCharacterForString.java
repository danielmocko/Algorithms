package code.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueCharacterForString  {
	
	
	public static void main (String [] args) throws IOException {
	System.out.println("Enter the string:");
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	char [] input = bf.readLine().toCharArray();
	
	boolean flag =check(input);
	
	if(flag)
		System.out.println("String doesn't contains duplicate characters");
	else
		System.out.println("\"String doesn't contains duplicate characters\"");
	}
	
	
	
	public static boolean check(char [] input) {
		String newInput ="" ;
		for(char c :input){
			if(newInput.contains(String.valueOf(c))) {
				newInput+=String.valueOf(c);
			}
			else
				return true;
		}
		return false;
	}
}
