package code.arrays;

public class MajorityElement {
	public static void main (String [] args) {
		int x [] = {11,25,46,53,21,54,96,85,21,41,1,18,25,85,51};
		int element =majorElement(x);
		
		System.out.println(String.valueOf(element));
		
	}
	
	public static int majorElement(int [] x) {
		int index=x.length%2;
		int majority =x[index];
		
		for(int i=0;i<x.length;i++) {
			if(x[i]>majority)
			{
				majority=x[i];
			}
		}
		
		return majority;
	}
}
