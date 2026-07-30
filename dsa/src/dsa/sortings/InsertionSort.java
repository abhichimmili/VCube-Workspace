package dsa.sortings;

public class InsertionSort {
	static void sort(int[] arr) {
		int temp=0;
		int j=0;
		
		for(int i=1;i<arr.length;i++) {
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
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
