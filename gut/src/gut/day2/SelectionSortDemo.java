package gut.day2;


//Constraints:
//Use SelectionSort
//Do not use Collections.sort() or Arrays.sort()
public class SelectionSortDemo {
	
	static void sort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}

	public static void main(String[] args) {
		int[] arr= {64,25,12,22,11};
		display(arr);
		sort(arr);
		display(arr);
	}

	private static void display(int[] arr) {
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}

}
