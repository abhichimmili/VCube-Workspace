package gut.day15;

//2. Given a string and a character, count its occurrences.
//Example:
//Input:
//str = "banana"
//ch = 'a'
//Output:
//3
//Constraint:
//Time Complexity: O(n)
public class CharOccurences {

	public static void main(String[] args) {
		String str = "banana";
		char ch = 'a';
		int count = 0;
//		Time  → O(n) Space → O(n)
		for (char c : str.toCharArray()) {
			if (c == ch)
				count++;
		}
//		Time  → O(n) Space → O(1)
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(count);

	}

}
