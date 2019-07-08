package code.arrays;

public class DuplicateNumbers {
	public static void main(String [] args) {
		int x[] = {1,2,3,4,5,6,7,8,9};
		boolean state =checkDuplicatenumbers(x);
		
		
		System.out.println(state);
	}
	
	public static boolean checkDuplicatenumbers( int [] x) {
		for(int i =0;i<x.length;i++)
			for(int j=i+1;j<x.length;j++)
					if(x[i]==x[j])
						return false;
		
		return true;
		
		
	}
	
}
