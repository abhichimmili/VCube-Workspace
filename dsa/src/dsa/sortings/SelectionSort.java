package dsa.sortings;

public class SelectionSort {

	static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {23,67,14,75,92,3,86};
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		sort(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
