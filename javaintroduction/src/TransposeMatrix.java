
public class TransposeMatrix {

	public static void main(String[] args) {
		int arr[][]= {{1,2},{3,4},{5,6}};
		int rows=arr.length;
		int cols=arr[0].length;
		int res[][]=new int[cols][rows];
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				res[i][j]=arr[j][i];
			}
		}
		System.out.println("Given Matrix : ");
		for(int a[]:arr) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		System.out.println("Transposed : ");
		for(int a[]:res) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}

	}

}
