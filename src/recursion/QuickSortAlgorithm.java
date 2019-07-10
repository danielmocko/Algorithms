package recursion;

public class QuickSortAlgorithm {
	public static void main (String [] args) {
		int [] numbers = {3,8,7,5,2,1,9,6,4};
		int len = numbers.length;
		System.out.println("QuickSort by recursive method: ");
		quickSort_Recursive(numbers, 0, len-1);
		for(int i=0;i<len;i++)
			System.out.println(numbers[i]);
		
	}
	
	public static void quickSort_Recursive(int [] arr, int left, int right) {
		
		if(left<right) {
			int pivot = partition(arr,left,right);
			
			if(pivot >1) 
				quickSort_Recursive(arr, left, pivot-1);
			
			if(pivot+1<right)
				quickSort_Recursive(arr, pivot +1, right);
		}
		
	}
	
	public static int partition(int [] numbers,int left,int  right) {
		int pivot =numbers[left];
		while(true) {
			while(numbers[left]<pivot) 
				left++;
			while(numbers[right]>pivot)
				right--;
			
			if(left<right) {
				int temp = numbers[right];
				numbers[right]=numbers[left];
				numbers[left]=temp;
			}
			else {
				return right;
			}
		}
	}
}
