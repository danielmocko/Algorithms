package code.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;





public class SortingArrayInDescendingOrder {
	public static void main (String args []) {
		int [] x = {7,55,42,15,3,6,9,48,12,633,55,47,23,32};
		x=descendingOrder(x);
		
		for(int i : x)
			System.out.println(String.valueOf(i));
		
	}
	
	public static int [] descendingOrder (int [] x) {
		
		for(int i=0;i<x.length;i++) 
			for(int j=0;j<x.length;j++)
				if(x[i]<x[j]) {
					int temp = x[i];
				    x[i] = x[j];
				    x[j]= temp;
				}
		
		
		return x;
	}
	
	
}
