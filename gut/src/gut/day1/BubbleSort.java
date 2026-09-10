package gut.day1;

//Use Bubble Sort,Do not use built-in functions
public class BubbleSort {
	
	private static void sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			boolean status=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					status=true;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(!status) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr= {5,3,8,4,2};
		display(arr);
		sort(arr);
		display(arr);
		
	}

	private static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

}
