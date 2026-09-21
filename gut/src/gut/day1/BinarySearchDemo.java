package gut.day1;

import java.util.Scanner;

//array is sorted,use binary search,time complexity:o(log n)
public class BinarySearchDemo {
	
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a element to search : ");
		int val=sc.nextInt();
		
		int left=0;
		int right=arr.length-1;
		int mid=0;
		while(left<=right) {
			mid=(left+right)/2;
			if(val==arr[mid]) {
				System.out.println(mid);
				break;
			}else if(arr[mid]<val) {
				left=mid+1;
//				System.out.print(left);
			}else {
				right=mid-1;
//				System.out.print(right);
			}
		}
		
	}

//	private static void search(int[] arr,int val,int start,int end) {
		
	//}
//	private static void search(int[] arr,int val,int start,int end) {
//		int mid=(start+end)/2;
//		if(start==end) {
//			System.out.println(start);
//		}
//		if(val>=arr[start]&&val<=arr[mid]) {
//			search(arr,val,start,mid);
//		}else if(val>=arr[mid]&&val<=arr[end]) {
//			search(arr,val,mid,end);
//		}else {
//			System.out.println("-1");
//			return ;
//		}
//	}

}
