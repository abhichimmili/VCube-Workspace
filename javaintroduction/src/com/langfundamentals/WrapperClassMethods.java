package com.langfundamentals;

public class WrapperClassMethods {

	public static void main(String[] args) {
		String intValue = "80";
		String doubleValue = "59.86";
		String booleanValue="true";
		char charValue='G';
		String stringValue="Abhi";

		System.out.println("String Integer to integer "+Integer.parseInt(intValue));
		// System.out.println(Integer.parseInt(charValue));
		// System.out.println(Integer.parseInt(doubleValue));
		
		System.out.println("String Integer to double "+Double.parseDouble(intValue));
		System.out.println("String Double to double "+Double.parseDouble(doubleValue));
		// System.out.println(Double.parseDouble(charValue));
		
		System.out.println("String Boolean literal to boolean "+Boolean.parseBoolean(booleanValue));
		
		System.out.println("Char to char "+Character.toString(charValue));

	}

}
