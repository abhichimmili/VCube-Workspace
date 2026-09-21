package gut.day6;

//T.C:O(n)
public class FindIfArraySorted {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		boolean res = findIfArraySorted(arr);
		System.out.println(res);
	}

	private static boolean findIfArraySorted(int[] arr) {
		boolean status = true;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				status = false;
			}
		}
		return status;
	}

}
