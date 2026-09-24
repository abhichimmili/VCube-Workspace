package gut.day9;

import java.util.Arrays;

//1. Given a sorted array, remove duplicates and return the new length.
//Example:
//Input:
//arr = [1, 1, 2, 2, 3, 4, 4]
//Output:
//[1, 2, 3, 4]
//Length = 4
//Constraint:
//Use Two Pointer Approach
//Time Complexity: O(n)
public class RemoveDuplicates {

	static int[] removeDup(int[] arr) {
		int[] temp = new int[arr.length];
		int p1 = Integer.MIN_VALUE;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			int p2 = arr[i];
			if (p1 != p2) {
				p1 = p2;
				temp[j++] = p1;
			}
		}
		System.out.println(temp.length);
		return temp;
	}
	
	static void removeDuplicate(int[] arr) {
		int[] temp = new int[arr.length];
		int p1 = Integer.MIN_VALUE;
		int j = 0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			int p2 = arr[i];
			if (p1 != p2) {
				p1 = p2;
				arr[j++] = p1;
				count++;
			}
		}
		System.out.println(count);
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 4, 4 };
//		System.out.println(Arrays.toString(removeDup(arr)));
		removeDuplicate(arr);
	}
}
