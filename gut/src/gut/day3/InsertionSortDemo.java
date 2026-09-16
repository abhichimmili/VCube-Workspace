package gut.day3;

import java.util.Arrays;

public class InsertionSortDemo {

	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6 };
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp=arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
	}

}
