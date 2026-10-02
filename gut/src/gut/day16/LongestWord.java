package gut.day16;

//1. Given a sentence, find the longest word.
//Example:
//Input:
//str = "In Vcube, Java is simple"
//Output:
//simple
//Constraint:
//Ignore punctuation & Symbols
public class LongestWord {

	public static void main(String[] args) {
		String str = "In Vcube,Java is simple";
		String[] words = str.split("[^a-zA-Z]+");
		int max = 0;
		String maxWord = "";
		for (String word : words) {
			if (word.length() > max) {
				max = word.length();
				maxWord = word;
			}
		}
		System.out.println(maxWord);
	}
}
