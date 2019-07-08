package code.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAllSubstrings {
	public static void main (String [] args) throws IOException {
		
		System.out.println("Enter the string");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		
		for(int i = 1 ; i <=str.length();i++) {
			for(int j = 0 ; j<i;j++) {
				String substring = str.substring(j,i);
				System.out.println(substring);
			}
		}
	}
}
