package gut.day18;

//1. Add two binary strings.
//Example:
//Input:
//a = "11"
//b = "1"
//Output:
//100
public class AddTwoBinaryStrings {

	static int binaryToDecimal(String str) {
		int bin = 0;
		try {
			bin = Integer.parseInt(str);
		} catch (Exception e) {
			System.out.println("Not a number");
		}
		int initial = 1;
		int dec = 0;
		for (int i = 0; i < str.length(); i++) {
			int ld = bin % 10;
			dec = dec + initial * ld;
			initial = initial * 2;
			bin = bin / 10;
		}
		return dec;
	}

	static String addTwoNums(int i1, int i2) {
		String str = "";
		int res = i1 + i2;
		while (res != 0) {
			int rem = res % 2;
			str = rem + str;
			res = res / 2;
		}
		return str;
	}

//	Time: O(max(n, m))
//	Space: O(max(n, m))
	static String addBinary(String s1, String s2) {
		int i = s1.length() - 1;
		int j = s2.length() - 1;
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		while (i >= 0 || j >= 0) {
			int x = (i >= 0) ? s1.charAt(i--) - '0' : 0;
			int y = (j >= 0) ? s2.charAt(j--) - '0' : 0;
			int sum = x + y + carry;
			sb.append(sum % 2);
			carry = sum / 2;
		}
		if (carry != 0) {
			sb.append(carry);
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		String b1 = "101";
		String b2 = "1";
		System.out.println(addTwoNums(binaryToDecimal(b1), binaryToDecimal(b2)));
		System.out.println(addBinary(b1, b2));
	}
}
