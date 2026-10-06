package gut.day17;


//1. Given a sentence, reverse every word while keeping word positions unchanged.
//Example:
//Input:
//str = "Java Full Stack"
//Output:
//avaJ lluF kcatS
//Constraint:
//Preserve spaces
public class ReverseEveryWord {

	public static void main(String[] args) {
		String str = "Java Full Stack";
		String[] words=str.split(" ");
		for(String word:words) {
			for(int i=word.length()-1;i>=0;i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
