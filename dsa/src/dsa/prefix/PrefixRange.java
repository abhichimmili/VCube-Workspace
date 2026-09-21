package dsa.prefix;

import java.util.Arrays;

//Prefix Sum Range

public class PrefixRange {

	public static void main(String[] args) {

		int[] arr = { 5, 10, 15, 30, 55, 60, 85 };
		int[] prefix = new int[arr.length];
		int l = 3, r = 3;
		int sum = 0;

		prefix[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}
		System.out.println(Arrays.toString(prefix));

		if (l == 0) {
			sum = prefix[r];
		} else {
			sum = prefix[r] - prefix[l - 1];
		}
		System.out.println("Sum of l :" + l + " and r :" + r + " are : " + sum);
	}

}
