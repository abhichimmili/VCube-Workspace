package gut.day5;

import java.util.Arrays;

//In-place solution preferred
//Time Complexity: O(n)
public class MovingZeroesToEnd {
	
	private static void movingZeroesToEnd(int[] arr){
		int zero_index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[zero_index];
				arr[zero_index]=temp;
				zero_index++;
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {0,1,0,2,3};
		System.out.println(Arrays.toString(arr));
		movingZeroesToEnd1(arr);
		System.out.println(Arrays.toString(arr));
	}
	private static void movingZeroesToEnd1(int[] arr){
		int zero_index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[zero_index]=arr[i];
				zero_index++;
			}
		}
		for(int j=zero_index;j<arr.length;j++) {
			arr[j]=0;
		}
	}
}
