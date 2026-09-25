package gut.day11;

//1. Find all occurrences of a pattern in a text.
//Example:
//Input:
//text = "AABAACAADAABAABA"
//pattern = "AABA"
//Output:
//[0,9,12]
public class PatternOccurrences {

	public static void main(String[] args) {
		String text = "AABAACAADAABAABA";
		String pattern = "AABA";
		int pl=pattern.length();
		int i=0;
		while((i+pl)<text.length()) {
			int patternIndex=text.indexOf(pattern, i);
			System.out.print(patternIndex+" ");
			i=text.indexOf(pattern, i)+1;
		}
	}

}
