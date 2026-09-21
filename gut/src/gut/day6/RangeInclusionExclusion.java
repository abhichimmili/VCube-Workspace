package gut.day6;

public class RangeInclusionExclusion {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 2, 10 }, { 3, 9 }, { 5, 8 } };
		findRangeIncluded(arr);
		findRangeExcluded(arr);

	}

	private static void findRangeExcluded(int[][] arr) {
		System.out.print("Excluded = ");
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i][0] <= arr[j][0] && arr[i][1] >= arr[j][1]) {
					flag = true;
					break;
				}
			}
			if (flag)
				System.out.print(1 + " ");
			else
				System.out.print(0 + " ");
		}
		System.out.println();
	}

	private static void findRangeIncluded(int[][] arr) {
		System.out.print("Included = ");
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i][0] >= arr[j][0] && arr[i][1] <= arr[j][1]) {
					flag = true;
					break;
				}
			}
			if (flag)
				System.out.print(1 + " ");
			else
				System.out.print(0 + " ");
		}
		System.out.println();
	}

}
