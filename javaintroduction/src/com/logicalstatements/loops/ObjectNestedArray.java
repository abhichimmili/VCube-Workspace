package com.logicalstatements.loops;

//import java.util.Arrays;

public class ObjectNestedArray {
	static int count = 0;
	static int[] temp;
	static int i = 0;

	public static void main(String[] args) {
		Object[] arr = { 10, new Object[] { 20, 30 }, 40, new Object[] { 50, new Object[] { 60, 70 } } };
		count(arr);
		temp = new int[count];
		getValues(arr);
		traverseArray(arr);
		System.out.println();
		reverseObjectArray(arr);
		traverseArray(arr);
		System.out.println();

//		System.out.println(count);
//		System.out.println(Arrays.toString(temp));

	}

	private static void traverseArray(Object[] arr) {
		System.out.print("{");
		for (Object a : arr) {
			if (a instanceof Integer) {
				System.out.print(" " + a + " ,");
			} else {
				System.out.print(" new Object[] ");
				traverseArray((Object[]) a);
			}
		}
		System.out.print("}");
	}

	private static void reverseObjectArray(Object[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] instanceof Integer) {
				i--;
				arr[index] = temp[i];
			} else {
				reverseObjectArray((Object[]) arr[index]);
			}
		}
	}

	private static void getValues(Object[] arr) {
		for (Object a : arr) {
			if (a instanceof Integer) {
				temp[i] = (int) a;
				i++;
			} else {
				getValues((Object[]) a);
			}
		}
	}

	private static void count(Object[] arr) {
		for (Object a : arr) {
			if (a instanceof Integer) {
				count++;
			} else {
				count((Object[]) a);
			}
		}
	}

}
