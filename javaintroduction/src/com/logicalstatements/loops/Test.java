package com.logicalstatements.loops;

import java.util.Arrays;

public class Test {
	static void c(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i]+a[i+1];
			a[i+1]=a[i]-a[i+1];
		}
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		c(a);
		System.out.println(Arrays.toString(a));
		
		int x=4,y=7,z=3;
		x+= ++y - z --;
		y= x++ + --z - --y;
		z+= --x +y++ - ++z;
		System.out.println(x+" "  + y+" "+z);
		
		int[] a1= {5,10,15,20};
		int i=3;
		a1[i]--;
		a1[--i]++;
		a1[i--]=--a1[i];
		System.out.println(a1[0]+" "+a1[1]+" "+a1[2]+" "+a1[3]);
		
		Integer a2=100;
		Integer b= new Integer(100);
		String s1="100";
		String s2=new String("100");
		String s3=s2.intern();
		System.out.println(a2==b);
		System.out.println(a2.equals(b));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(a2.equals(s3));
		
	}

}
