package dsa.sortings;

import java.util.Arrays;

public class MergeSort {
	//divide and conquer
	static void divide(int[] arr) {
		if(arr.length==1)
			return;
		int[] left=new int[arr.length/2];
		int[] right = new int[arr.length -left.length];
		int i=0;
		for(int j=0;j<left.length;j++) {
			left[j]=arr[i++];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=arr[i++];
		}
		divide(left);
		System.out.println("Left :"+Arrays.toString(left));
		divide(right);
		System.out.println("Right :"+Arrays.toString(right));
		mergeSort(left,right,arr);
		
	}
	static void mergeSort(int[] l,int[] r,int[] arr) {
		int i=0;
		int j=0;
		int k=0;
		while(i < l.length && j < r.length) {
			//checking and sorting left and right arr items
			if(l[i]<r[j]) {
				arr[k++]=l[i++];
			}else {
				arr[k++]=r[j++];
			}
		}
		//remaining elements
		while(i<l.length) {
			arr[k++]=l[i++];
		}
		while(j<r.length) {
			arr[k++]=r[j++];
		}
	}

	public static void main(String[] args) {
		int arr[]= {23,67,14,75,92,3,86};
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		divide(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
