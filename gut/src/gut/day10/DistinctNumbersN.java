package gut.day10;

//1. Given an array containing n+1 integers where each integer is between 1 and n, find the duplicate number.
//Example:
//Input:
//arr = [1, 3, 4, 2, 2]
//Output:
//2
//Constraint:
//Do not modify the array
//Time Complexity: O(n)
public class DistinctNumbersN {
	static int findDistinct(int[] arr){
		int n = arr.length+1;
		int[] freq=new int[n];
		for(int i=0;i<n-1;i++) {
			freq[arr[i]]++;
			if(freq[arr[i]]>1) {
				return arr[i];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 2, 2 };
		System.out.println(findDistinct(arr));
	}

}
