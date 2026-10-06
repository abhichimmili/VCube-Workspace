package gut.day17;

//2. Given a sentence, reverse the order of words.
//Example:
//Input:
//str = "Java Full Stack"
//Output:
//Stack Full Java
//Constraint:
//Remove extra spaces
public class ReverseWordsOrder {

	public static void main(String[] args) {
		String str = "Java    Full Stack";
		String[] words = str.trim().split(" ");//--->\\s+ means one or more white spaces
		for (int i = words.length - 1; i >= 0; i--) {
			if (words[i] != "") {
				System.out.print(words[i] + " ");
			}
		}
	}

}
