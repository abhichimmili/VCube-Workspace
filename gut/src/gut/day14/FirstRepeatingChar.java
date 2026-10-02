package gut.day14;

import java.util.HashMap;

//2. Given a string, find the first repeating character.
//Example:
//Input:
//str = "programming"
//Output:
//r
//Constraint:
//Time Complexity: O(n)
public class FirstRepeatingChar {

	public static void main(String[] args) {
		String str = "programming";

		// using indexOf and lastIndexOf
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (str.indexOf(c) != str.lastIndexOf(c)) {
				System.out.println(c);
				break;
			}
		}
	}

//	Time=O(n), Space=O(1)
	static char fisrtRepeated(String s) {
		int[] freq = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i)]++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (freq[s.charAt(i)] > 1) {
				return s.charAt(i);
			}
		}
		return '\0';
	}

	static char firstRepeating(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (char c : str.toCharArray()) {

			if (map.get(c) > 1) {
				return c;
			}
		}

		return '\0';
	}
}
