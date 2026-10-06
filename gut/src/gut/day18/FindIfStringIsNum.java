package gut.day18;

//2. Given a string, determine whether it contains only numeric digits.
//Example:
//Input:
//str = "12345"
//Output:
//true
//Constraint:
//Do not use parsing methods
public class FindIfStringIsNum {

	public static void main(String[] args) {
		String str = "12345";
		System.out.println(IsNum(str));
	}

	private static boolean IsNum(String str) {
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
			// when no functions are allowed
//			if (c < '0' || c > '9') {
//                return false;
//            }
		}

		return true;
	}

}
