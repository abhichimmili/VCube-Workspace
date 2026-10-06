package gut.day13;

import java.util.HashSet;

//2. Given a string, remove duplicate characters while maintaining order.
//Example:
//Input:
//str = "programming"
//Output:
//progamin
public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "programming";
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			set.add(c);
		}
		for (int i = 0; i < str.length(); i++) {
			if(set.contains(str.charAt(i))) {
				System.out.print(str.charAt(i));
				set.remove(str.charAt(i));
			}
		}
	}

}
