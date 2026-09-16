package gut.day3;

//Don't sort the array
//Time complexity:O(n)
public class ThirdLargestDemo {
	
	

	public static void main(String[] args) {
		int[] arr= {10,20,4,45,99};
		find(arr);
	}

	private static void find(int[] arr) {
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==first||arr[i]==second||arr[i]==third) {
				continue;
			}
			if(arr[i]>first) {
				third=second;
				second=first;
				first=arr[i];
			}
			if(arr[i]>second&&arr[i]<first) {
				third=second;
				second=arr[i];
			}
			if(arr[i]>third&&arr[i]<second) {
				third=arr[i];
			}
		}
		System.out.println(third);
	}

}
