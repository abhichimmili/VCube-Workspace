package dsa.prefix;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] arr = { -2, -1, -2, 0, 1, 0, 2 };
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int val : arr) {
			currSum += val;
			if (currSum > maxSum) {
				maxSum = currSum;
			}
			if (currSum < 0) {
				currSum = 0;
			}
		}
		System.out.println("Max Sub Array Sum:" + maxSum);
	}

}
