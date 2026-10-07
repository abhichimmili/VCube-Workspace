package gut.day19;

import java.util.HashMap;
import java.util.HashSet;

//2. Given a string, print all duplicate characters.
//Example:
//Input:
//str = "programming"
//Output:
//r
//g
//m
//Constraint:
//Print each duplicate once
public class DuplicateChars {

	public static void main(String[] args) {
		String str="programming";
		
		//TC:O(n2) SC:O(1)
		for(int i=1;i<str.length();i++) {
			for(int j=i-1;j>=0;j--) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println(str.charAt(j));
				}
			}
		}
		System.out.println("--------------");
		HashSet<Character> temp=new HashSet<>();
		for(int i=0;i<str.length();i++) {
			if(!temp.add(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
		}
		System.out.println("--------------");
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			map.put(c,map.getOrDefault(c,0)+1);
			if(map.get(c)==2) {
				System.out.println(c);
			}
		}
		System.out.println("--------------");
		//TC:O(n) SC:O(1)
		int[] freq = new int[256];

	    for (int i = 0; i < str.length(); i++) {
	        freq[str.charAt(i)]++;
	    }
	    for(int i=0;i<str.length();i++) {
	    	char c=str.charAt(i);
	    	if(freq[c]>1) {
	    		System.out.println(c);
	    		freq[c]=0;
	    	}
	    }
	}

}
