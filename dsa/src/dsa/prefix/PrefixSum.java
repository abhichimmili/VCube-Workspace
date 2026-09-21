package dsa.prefix;

//Prefix Sum
//Input:[ 5, 10, 15, 30, 55, 60, 85 ]
//Output:[5 15 30 60 115 175 260 ]
public class PrefixSum {

	public static void main(String[] args) {
		
		int[] arr = { 5, 10, 15, 30, 55, 60, 85 };
		int[] prefix = new int[arr.length];
		
		prefix[0] = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
			System.out.print(prefix[i] + " ");
		}
	}

}
