package dsa.others;

public class StringCharDuplicates {
	
	static String removeDup(String s) {
		String temp="";
		boolean[] t=new boolean[256];
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(t[c]==false) {
				temp=temp.concat(String.valueOf(c));
				t[c]=true;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str);
		System.out.println();
		System.out.print(removeDup(str));

	}

}
