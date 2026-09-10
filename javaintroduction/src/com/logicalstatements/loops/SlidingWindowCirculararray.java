package com.logicalstatements.loops;

import java.util.Arrays;

public class SlidingWindowCirculararray {

	public static void main(String[] args) {
//		int[] code = {5,7,1,4};
		int[] code = {1,2,3,4,5,6};
//		int k=2;
		int k=3;
		int n=code.length;
		int res[]=new int[n];
		for(int i=0;i<n;i++) {
			int val=0;
			for(int j=i+1;j<=i+k;j++) {
				int index=j;
				if(index>=n) {
					index=index%n;
				}
				val+=code[index];
			}
			res[i]=val;
		}
		System.out.println(Arrays.toString(code));
		System.out.println(Arrays.toString(res));
	}

}
