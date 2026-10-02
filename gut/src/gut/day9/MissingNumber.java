package gut.day9;

//2. Given an array containing numbers from 1 to n with one number missing, find the missing number.
//Example:
//Input:
//arr = [1, 2, 3, 5]
//Output:
//4
//Constraint:
//Time Complexity: O(n)
public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		int num = arr.length + 1;
		int j = 0;
		for (int i = 1; i <= num; i++) {
			if (i != arr[j++]) {
				System.out.println(i);
				break;
			}
		}
		int expectedSum=num*(num+1)/2;
		int actualSum=0;
		for (int i = 0; i <arr.length ; i++) {
			actualSum+=arr[i];
		}
		System.out.println(expectedSum-actualSum);
	}

}
