package gut.day13;

import java.util.HashMap;

//1. Given a string, find the frequency of every character.
//Example:
//Input:
//str = "banana"
//Output:
//b = 1
//a = 3
//n = 2
public class FreqEveryChar {

	public static void main(String[] args) {
		String str = "banana";
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (int i = 0; i < str.length(); i++) {
			if(map.get(str.charAt(i))>0) {
				System.out.println(str.charAt(i)+" = "+map.get(str.charAt(i)));
				map.put(str.charAt(i), 0);			
			}
		}
	}

}
