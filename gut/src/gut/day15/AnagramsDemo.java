package gut.day15;

import java.util.Arrays;
import java.util.HashMap;

//1. Given two strings, determine whether they are anagrams.
//Example:
//Input:
//str1 = "listen"
//str2 = "silent"
//Output:
//true
//Constraint:
//Ignore character order
public class AnagramsDemo {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		boolean isAnagram = true;
		if(str1.length()!=str2.length()) {
			isAnagram=false;
		}
		
		//temp array checking frequency TC:O(n),SC:O(1)
		int[] freq = new int[256];
		for (int i = 0; i < str1.length(); i++) {
	        freq[str1.charAt(i)]++;
	        freq[str2.charAt(i)]--;
	    }
//		for (char c : str1.toCharArray()) {
//			freq[c]++;
//		}
//		for (char c : str2.toCharArray()) {
//		freq[c]--;
//		}
		for (int i : freq) {
			if (i != 0) {
				isAnagram = false;
				break;
			}
		}
		System.out.println(isAnagram);
		
		isAnagram=true;
		//Sorting the array TC:O(n log n),SC:O(n)
		char[] temp1=str1.toCharArray();
		char[] temp2=str2.toCharArray();
		Arrays.sort(temp1);
		Arrays.sort(temp2);
		for(int i=0;i<str1.length();i++) {
			if(temp1[i]!=temp2[i]) {
				isAnagram=false;
				break;
			}
		}
		System.out.println(isAnagram);
	}
	//Using HashMap and and remove() method
	static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i = 0; i < s1.length(); i++) {
			map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0)+1);
		}
		for(int i=0;i<s2.length();i++) {
			Integer count=map.get(s2.charAt(i));
			if(count==null) {
				return false;
			}
			if(count==1) {
				map.remove(s2.charAt(i));
			}
			else {
				map.put(s2.charAt(i),count-1);
			}
		}
		return map.isEmpty();
	}

}
