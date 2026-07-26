
public class SecondLargest {

	public static void main(String[] args) {
		int arr[]= {45,32,56,36,12,78,21,98,17,61};
		int largest=arr[0];
		int secondLargest=arr[1];
		int third=arr[2];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				third=secondLargest;
				secondLargest=largest;
				largest=arr[i];
			}
		}
		
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i-1]<arr[i]) {
//				largest=arr[i];
//			}
//		}
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i-1]<arr[i] && arr[i]<largest) {
//				secondLargest=arr[i];
//			}	
//		}
		System.out.println(largest);
		System.out.println(secondLargest);
		System.out.println(third);
	}

}
