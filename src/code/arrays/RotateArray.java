package code.arrays;

public class RotateArray {
	public static void main (String [] args) {
		int [] x= {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int [] y =rotate(x,4);
		for(int z :y) {
			System.out.println(String.valueOf(z));
		}
		
	}
	
	public static int [] rotate(int [] x, int pivot) {
		pivot = pivot % x.length;
		//x = rotateSub(x,0,pivot-1);
		
		//x = rotateSub(x, pivot, x.length - 1);
		
		x = rotateSub(x, 0, x.length - 1);
		
		return x;
	}
	
	private static int [] rotateSub (int [] x, int start , int end) {
		while(start < end) {
			int temp = x[start];
			x[start] = x[end];
			x[end] = temp;
			start ++;
			end--;
		}
		return x;
	}
}
