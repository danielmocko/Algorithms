package code.arrays;

public class SwapMinAndMax {

	public static void main(String [] args) {
		int x [] = {515,84,22,5,2,98,2,29,5,22,2,51,52,95,95,7,26,26};
		
		swap(x);
	}
	
	public static void swap(int [] x) {
		int min=x[x.length%2];
		int max=x[x.length%2];
		
		for(int elem:x) {
			if(elem<min) 
				min = elem;
			if(elem>max)
				max = elem;
		}
		System.out.println("min: " + String.valueOf(min));
		System.out.println("max: " + String.valueOf(max));
		
		
	}
	
	
	
	
	
	
}


