package com.logicalstatements.loops;

public class KthLargest {

	public static void main(String[] args) {
		int[] arr= {10,5,20,8,15};
		int k=2;
		int[] rank=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int curr=arr[i];
			for(int j=0;j<rank.length;j++) {
//				if(curr<=arr[j]) {
				if(curr>arr[j]) {
					rank[j]++;
				}
			}
		}
		for(int i=0;i<rank.length;i++) {
			System.out.print(rank[i]+" ");
//			if(rank[i]==rank.length-k+1) {
			if(rank[i]==k-1) {
				System.out.println("Kth largest is "+arr[i]);
			}
		}
		int kthMax = Integer.MAX_VALUE;

		for (int j = 0; j < k; j++) {

		    int max = Integer.MIN_VALUE;

		    for (int i = 0; i < arr.length; i++) {

		        if (arr[i] < kthMax && arr[i] > max) {
		            max = arr[i];
		        }
		    }

		    kthMax = max;
		}

		System.out.println(kthMax);

	}

}
