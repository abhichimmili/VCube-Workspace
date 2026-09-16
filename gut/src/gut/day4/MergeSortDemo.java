package gut.day4;

import java.util.Arrays;

public class MergeSortDemo {

	public static void main(String[] args) {
		int[] arr= {38, 27, 43, 3, 9, 82, 10};
		divide(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void divide(int[] arr) {
		if(arr.length==1)
			return;
		int[] left= new int[arr.length/2];
		int[] right=new int[arr.length-left.length];
		
		int i=0;
		for(int j=0;j<left.length;j++) {
			left[j]=arr[i++];
		}
		for(int k=0;k<left.length;k++) {
			right[k]=arr[i++];
		}
		
		divide(left);
		System.out.println("Left:"+Arrays.toString(left));
		divide(right);
		System.out.println("Right:"+Arrays.toString(right));
		mergeSort(left,right,arr);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void mergeSort(int[] l, int[] r, int[] arr) {
		int i=0;
		int j=0;
		int k=0;
		while(i<l.length&&j<r.length) {
			if(l[i]<r[j]) {
				arr[k++]=l[i++];
			}else {
				arr[k++]=r[j++];
			}
		}
		while(i<l.length) {
			arr[k++]=l[i++];
		}
		while(j<r.length) {
			arr[k++]=r[j++];
		}
	}
}
