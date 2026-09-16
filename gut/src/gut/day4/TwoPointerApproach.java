package gut.day4;

import java.util.Arrays;

public class TwoPointerApproach {

	
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		reverse1(arr);
		System.out.println(Arrays.toString(arr));
		reverse2(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void reverse2(int[] arr) {
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}

	private static void reverse1(int[] arr) {
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}

}
