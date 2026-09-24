package com.exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// Taking two numbers as Strings
			System.out.print("Enter first number: ");
			String str1 = sc.next();

			System.out.print("Enter second number: ");
			String str2 = sc.next();

			// Converting String to int
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);

			// Division
			int result = num1 / num2;
			System.out.println("Result : " + result);
			
			// Creating an array
            int[] arr = {10, 20, 30, 40, 50};

            // Taking index
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.println("Element: " + arr[index]);

		} catch (NumberFormatException e) {
			System.out.println("Invalid number format. Please enter numbers only.");
		} catch (ArithmeticException e) {
			System.out.println("Cannot divisible by zero.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array Index.");
		}finally {
			sc.close();
		}
	}

}
