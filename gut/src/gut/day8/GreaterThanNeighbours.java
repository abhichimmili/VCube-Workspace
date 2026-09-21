package gut.day8;

//1. Find an element that is greater than its neighbors.
//Example:
//Input:
//arr = [1, 3, 20, 4, 1, 0]
//Output:
//20

public class GreaterThanNeighbours {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 20, 4, 1, 0 };
		
		if(arr[0]>arr[1]) {
			System.out.println(arr[0]);
		}
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				System.out.println(arr[i] + " ");
			}
		}
		if(arr[arr.length-2]<arr[arr.length-1]) {
			System.out.println(arr[arr.length-1]);
		}
		
		
//		for (int i = 0; i < arr.length; i++) {
//
//		    boolean greaterLeft = i == 0 || arr[i] > arr[i - 1];
//		    boolean greaterRight = i == arr.length - 1 || arr[i] > arr[i + 1];
//
//		    if (greaterLeft && greaterRight) {
//		        System.out.println(arr[i]);
//		    }
//		}
	}

}
