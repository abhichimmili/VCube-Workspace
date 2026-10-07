package gut.day19;

//1. Generate all subsequences of a string.
//Example:
//Input:
//ABC
//Output:
//"",A,B,C,AB,AC,BC,ABC
public class SubSequencesOfString {

	public static void main(String[] args) {
		String str = "ABC";
		generate(str, 0, "");

		System.out.println("---------");
		for (int length = 1; length <= str.length(); length++) {
			generateLength(str, length, 0, "");
		}
	}
	//A B C AB AC BC ABC
	private static void generateLength(String str, int length, int start, String res) {
		// Base Case
		if (length == res.length()) {
			System.out.print(res + " ");
			return;
		}
		for (int i = start; i < str.length(); i++) {
	        generateLength( str, length, i + 1, res + str.charAt(i) );
	    }
	}
	
	//C B BC A AC AB ABC
	private static void generate(String str, int index, String res) {

		// Base Case
		if (index == str.length()) {
			System.out.print(res + " ");
			return;
		}

		generate(str, index + 1, res);
		generate(str, index + 1, res + str.charAt(index));
	}

}
