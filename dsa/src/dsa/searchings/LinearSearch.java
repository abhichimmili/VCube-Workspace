package dsa.searchings;

import java.util.Scanner;

public class LinearSearch {
	
	static int search(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {23,67,14,75,92,3,86};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to find : ");
		int key=sc.nextInt();
		System.out.println("The value found at : "+search(arr,key));

	}

}
