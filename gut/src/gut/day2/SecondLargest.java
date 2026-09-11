package gut.day2;

//Do not sort the array
//Time Complexity:O(n)
public class SecondLargest {
	
	private static int find(int[] arr) {
		int secondMax=-1;
		int max=-1;
		for(int a:arr) {
			if(a>max) {
				secondMax=max;
				max=a;
			}
			if(a< secondMax  && a>max) {
				secondMax=a;
			}
		}
		
		return secondMax;
	}
	public static void main(String[] args) {
		int[] arr= {12,45,67,23,89,54};
		int res=find(arr);
		System.out.println("Second highest element is : "+res);
	}

}
