package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {
	public static void main (String [] args) throws NumberFormatException, IOException {
		
		int [] arr = new int[100];
		
		System.out.println("Enter the number: ");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		
		for(int i=0;i<100;i++) {
			arr[i]=100-i;
		}
		
		int result =search(arr,0,99,input);
		
		System.out.println(result);
		
		
	}
	
	
	public static int search(int [] arr,int min, int max,int key) {
		int mid = (min+max)/2;
		if(min>max)
			return arr[mid];
		else {
			
			if(arr[mid]==key) {
				return ++mid;
			}
			else if(arr[mid]<key){
				return search(arr, mid+1, max, key);
			}else {
				return search(arr, min, mid-1, key);
			}
		}
	}
}
