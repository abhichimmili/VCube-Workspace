package dsa.searchings;

import java.util.Scanner;

public class BinarySearch {
	//binary search only for sorted array
	static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	static int search(int[] arr,int key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid= low+(high-low)/2;
			if(arr[mid]==key) {
				return mid;
			}else if(key<arr[mid]) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {23,67,14,75,92,3,86};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to find : ");
		int key=sc.nextInt();
		sort(arr);
		System.out.println("The value found at : "+search(arr,key));

	}

}
