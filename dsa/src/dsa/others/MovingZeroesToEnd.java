package dsa.others;

public class MovingZeroesToEnd {
	
	static void moveZeros(int[] arr) {
//		int index=0;
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=0) {
//				arr[index]=arr[i];
//				index++;
//			}
//		}
//		
//		for(;index<arr.length;index++) {
//			arr[index]=0;
//		}
		int x=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[x];
				arr[x]=temp;
				x++;
			}
		}
		
		
		
//		int zeroIndex=0;
//		int nonZeroIndex=0;
		
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[zeroIndex]==0 && arr[nonZeroIndex]!=0 && zeroIndex<nonZeroIndex) {
//				arr[zeroIndex]=arr[nonZeroIndex];
//				arr[nonZeroIndex]=0;
//			}
//			if(arr[i]==0) {
//				zeroIndex=i;
//			}else {
//				nonZeroIndex=i;
//			}
//		}
		
		
		
//		while(index<arr.length) {
//			arr[index]=0;
//			index++;
//		}
	}

	public static void main(String[] args) {

		int arr[]= {10, 0, 20, 0, 30, 40};
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		moveZeros(arr);
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
	}

}
