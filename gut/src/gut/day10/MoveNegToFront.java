package gut.day10;

import java.util.Arrays;

//2. Given an array of integers, move all negative numbers to the beginning of the array.
//Example:
//Input:
//arr = [1, -2, 3, -4, 5, -6]
//Output:
//[-2, -4, -6, 1, 3, 5]
//Constraint:
//Time Complexity: O(n)
public class MoveNegToFront {

	public static void main(String[] args) {
		int[] arr = { 1, -2, 3, -4, 5, -6 };
		int[] res = new int[arr.length];
		int k=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=0) {
				res[k++]=arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0) {
				res[k++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(res));

		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				int temp = arr[i];
				arr[i] = arr[x];
				arr[x] = temp;
				x++;
			}
		}
		System.out.println(Arrays.toString(arr));// [-2, -4, -6, 1, 5, 3]

	}

}
