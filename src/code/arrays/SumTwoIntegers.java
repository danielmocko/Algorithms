package code.arrays;

public class SumTwoIntegers {
	
	public static void main(String [] args) {
		int [] x = {1,2,3,4,5,6,7,8,9};
		boolean flag =sumElementsArray(x,57);
		System.out.println(flag);
		
	}
	
	public static boolean sumElementsArray (int [] x , int target) {
		for(int i=0;i<x.length;i++)
			for(int j=0;j<x.length;j++) 
				if(i!=j) 
					if(x[i]+x[j]==target)
						return true;
		
		return false;
	}
	
}
