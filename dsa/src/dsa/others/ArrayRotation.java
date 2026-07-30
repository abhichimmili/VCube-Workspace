package dsa.others;

public class ArrayRotation {
	
	static void rotate(int[] arr,int value) {
		reverse(arr,0,arr.length-1);
		reverse(arr,0,value-1);
		reverse(arr,value,arr.length-1);
		
	}
	static void reverse(int[] a,int i,int j) {
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}

	public static void main(String[] args) {
		int arr[]= {23,67,14,75,92,3,86};
		int val=4;
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		rotate(arr,val);
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}
