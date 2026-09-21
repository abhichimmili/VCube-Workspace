package gut.day7;

//An element is called a leader if it is greater than all elements to its right.
//Constraint:
//Time Complexity: O(n)
public class LeaderofRightElements {

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		findLeader(arr);
	}

	private static void findLeader(int[] arr) {
		int end = arr.length - 1;
		int max = Integer.MIN_VALUE;
		for (int i = end; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				System.out.print(max + " ");
			}
		}
	}

}
