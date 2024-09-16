//LINEAR SEARCH VIDEO 107

//The best advantage of linear search is that the data is not required to be in sorted manner which is necesary in case of binary search
// For small data sets linear search is benefitial

public class LinearSearch{
	public static void main(String[] args){
		int[] arr = {232,454,2,3,23,53,12,5353,1231,32};
		int num = 5353;
		for(int i =0 ; i<arr.length; i++){
			if(arr[i] == num){
				System.out.println("The number is found in poition: " + (i+1));
			}
		}
	}


	// We can also create using a function

	//public static int linearSearch(int[] array, int value){

		//code 
	//}
}