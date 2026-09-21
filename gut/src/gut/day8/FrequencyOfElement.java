package gut.day8;

//2. Given an array of integers, find the frequency of each element.
//Example:
//Input:
//arr = [1, 2, 2, 3, 1, 4, 2]
//Output:
//1 -> 2
//2 -> 3
//3 -> 1
//4 -> 1

public class FrequencyOfElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 1, 4, 2 };
		int max = findMax(arr);
		int[] freq = new int[max + 1];
		for (int i : arr) {
			freq[i]++;
		}
		for (int i : arr) {
			System.out.print(freq[i] + " ");
		}
	}

	private static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

}
