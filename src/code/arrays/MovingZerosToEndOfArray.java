package code.arrays;

public class MovingZerosToEndOfArray {
	public static void main (String [] args) {
		int [] x = {4,0,5,9,63,0,1,5,2,0,0,2,5,0};
		
		moveZeros(x);
	}
	
	public static void moveZeros(int [] x) {
		int length=x.length-1;
		
		for(int i=length;i>=0;i--)
			for(int j=length;j>=0;j--) {
				if(x[i]==0) {
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		
		for(int i:x) {
			System.out.println(String.valueOf(i));
		}
	}
}
