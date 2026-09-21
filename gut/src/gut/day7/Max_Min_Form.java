package gut.day7;

//Given a sorted array, rearrange it in max-min form.
//Input:
//arr = [1, 2, 3, 4, 5, 6]
//Output:
//[6, 1, 5, 2, 4, 3]
public class Max_Min_Form {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		findMaxMin(arr);
	}

	private static void findMaxMin(int[] arr) {
		int min=arr[0];
		int max=arr[arr.length-1];
		while(min<max) {
			System.out.print(max+" "+min+" ");
			max--;
			min++;
		}
		if(min==max) {
			System.out.println(min);
		}
	}

}
