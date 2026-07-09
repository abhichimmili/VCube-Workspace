package com.langfundamentals;

public class Test {
	
	public static void main(String[] args) {
		
		Integer i=100;
		Long b= 100L;
//		System.out.println(i==b);
		
		
		
		int val = 12213125;
		int temp=val;
		int d,count=0;
		while(temp > 0) {
			d = temp % 10;
			temp = temp/10;
			if(d==2) {
				count++;
			}
		}
	
		System.out.println(count);
//		byte b=100;
//		byte a=10,d=20;
//		byte e=(byte) (b+d);
//		b+=30;
//		char c=65;
//		System.out.println(b);
//		System.out.println('A'+1);
//		System.out.println(c+'B');
//		System.out.println(5+2*3);
//		int ex=50;
//		System.out.println(ex++);
//		System.out.println(++ex);
//		System.out.println(++c);
//		System.out.println(c++);
	}

}
