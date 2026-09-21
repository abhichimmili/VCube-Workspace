package gut.day5;

import java.util.Arrays;

public class QuickSortDemo {

	public static void main(String[] args) {
		int[] arr= {38, 27, 43, 3, 9, 82, 10};
		System.out.println(Arrays.toString(arr));
		quick_sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quick_sort(int[] arr, int start, int end) {
		if(start<end) {
			int p_index=partition(arr,start,end);
			quick_sort(arr,start,p_index-1);
			quick_sort(arr,p_index+1,end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot=arr[end];
		int p_index=start;
		for(int j=start;j<end;j++) {
			if(arr[j]<=pivot) {
				int temp=arr[j];
				arr[j]=arr[p_index];
				arr[p_index]=temp;
				p_index++;
			}
		}
		int temp=arr[end];
		arr[end]=arr[p_index];
		arr[p_index]=temp;
		return p_index;
	}
	
	

}
