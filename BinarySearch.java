//BINARY SEARCH VIDEO 108
// For large data sets binary search is benefitial than the linear search
// Half of the array is eliminated during each "step"
// Remember that in binary search we use while loop while(start<=end) and then inside conditions
// Look after the return statement which is imp
// It takes O(log n) time


import java.util.*;

public class BinarySearch{
	public static void main(String[] args){
		int[] arr = {1,3,5,7,9,11,13,15,17,19};
		int start=0;
		int end = arr.length-1;
		int mid = start + (end - start)/2;


		System.out.println("Enter the value to be searched for: ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		
		int result = binarySearch(arr,start,end,value);
		if(result ==-1){
			System.out.println("Value not found!");
		}else{
			System.out.println("The value is found at " + result);
		}

	}

	public static int binarySearch(int[] arr,int start, int end, int value){
		
		while(start<=end){
			int mid= start + (end - start)/2;
			if(arr[mid] == value){
				return mid+1;
				
			}

			if(arr[mid]>value){
				end = mid -1;
			}

			if(arr[mid]<value){
				start=mid +1;
			}
		}

		return -1;

	}
}