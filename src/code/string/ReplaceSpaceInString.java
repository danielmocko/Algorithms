package code.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceSpaceInString  {
	public static void main (String [] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input  = bf.readLine();
		String s = "";
		input =input.replace(" ", "%20");
		
		System.out.println(input);
		
	}
}
