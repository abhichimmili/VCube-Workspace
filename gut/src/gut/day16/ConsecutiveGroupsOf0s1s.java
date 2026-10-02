package gut.day16;

//2. Count substrings having equal consecutive 0s and 1s. All 0s are grouped together and all 1s are grouped together 
//Example:
//Input:
//00110011
//Output:
//6
public class ConsecutiveGroupsOf0s1s {

	public static void main(String[] args) {
		String input = "00110011";

		int prev = 0;
		int curr = 1;
		int count = 0;
		for(int i=1;i<input.length();i++) {
			if(input.charAt(i)==input.charAt(i-1)) {
				curr++;
			}else {
				count+=Math.min(prev, curr);
				prev=curr;
				curr=1;
			}
		}
		count += Math.min(prev, curr);
		System.out.println(count);
	}

}
