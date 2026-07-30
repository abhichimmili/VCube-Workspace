package dsa.others;

import java.util.HashSet;

public class RemoveDuplicates {
	
	static void removeDuplicates(int[] arr) {
		boolean[] temp = new boolean[50];
		for(int i=0;i<arr.length;i++) {
			if(temp[arr[i]]==false)
				temp[arr[i]]=true;
		}
		for(int i=0;i<temp.length;i++) {
			if(temp[i]==true) {
				System.out.print(i+",");
			}
		}
		System.out.println();
		//Using HashSet
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		for(Integer i:hs) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]= {10, 0, 20,2, 0, 30, 40};
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		removeDuplicates(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}
