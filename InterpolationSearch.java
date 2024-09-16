//INTERPOLATION SEARCH VIDEO 109
//1) It is also used to search for a particular element in a sorted array
//2) It is an improvement over BINARY SEARCH
//3) It has O(log (log n)) time
//4) Unlike binary search whilch always selects the middle elemnt, Interpolation search makes a more intelligent guess based on the distribution of the data
//5) It uses a formulaic approach to determine the position of the target element wihtin the array (probable location of target element)
//6) Rest of the algorithm goes same as binary search only difference is to replace the mid with this "probe" formula

public class InterpolationSearch{
	public static void main(String[] args){
		int[] arr = {1,3,5,7,9,11,13,15,17,19};
		int target = 13;
		int result = InterpolationSearch(arr,target);
		if(result == -1){
			System.out.println("Target not found!");
		}else{
			System.out.println("Target found at index " + result);
		}
	}

	public static int InterpolationSearch(int arr[],int target){
		int start = 0;
		int end = arr.length -1;

		while(start<=end && target >= arr[start] && target <= arr[end]){
			//HERE COMES THE FORMULA
			int probe = start + (end - start)*(target - arr[start])/(arr[end] - arr[start]);

			if(arr[probe] == target){
				return probe;
			}else if(arr[probe]>target){
				end = probe -1;
			}else{
				start = probe +1;
			}
		}

		return -1;
	}
}