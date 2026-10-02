package gut.day12;

//1. Check whether two strings are rotations of each other
//Input:
//str1 = "ABCD"
//str2 = "CDAB"
//Output: true
public class Rotations {

	public static void main(String[] args) {
		String str1="ABCD";
		String str2="CDABC";
		boolean flag=true;
		if(str1.length()!=str2.length()) {
			flag=false;
		}else {
		str1=str1+str1;
		flag = str1.contains(str2);
		}
		System.out.println(flag);
	}

}
