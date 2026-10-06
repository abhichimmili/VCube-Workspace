package gut.day12;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String str = "{[]()}";
		Deque<Character> dq = new ArrayDeque<>();
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				dq.push(ch);
			} else if (ch == '}' || ch == ']' || ch == ')') {
				if (dq.isEmpty()) {
					flag = false;
					break;
				}
				char top = dq.pop();
				if ((ch == '}' && top != '{') || 
						(ch == ']' && top != '[') ||
						(ch == ')' && top != '(')) {
					flag=false;
					break;
				}
			}
		}
		System.out.println(dq.isEmpty()&&flag);
	}

}
