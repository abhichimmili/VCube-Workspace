package dsa.sortings;

//Bubble sort
public class BubbleSort {
	
	static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
			if(count==0) {
				return;
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
