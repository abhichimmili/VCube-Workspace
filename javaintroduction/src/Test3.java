
public class Test3 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int total=0;
		int n=arr.length;
		int sumArr[]=new int[n];
		for(int i=0;i<n;i++) {
			total=total+arr[i];
		}
		for(int i=0;i<n;i++) {
			sumArr[i]=total-arr[i];
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		for(int a:sumArr) {
			System.out.print(a+" ");
		}

	}

}
