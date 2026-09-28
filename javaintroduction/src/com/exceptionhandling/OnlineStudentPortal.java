package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OnlineStudentPortal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Find length of String
        try {
            String studentName = null;

            System.out.println("Student Name Length: "
                    + studentName.length());

        } catch (NullPointerException e) {

            System.out.println("Error: Student name cannot be null.");
        }


        // 2. Take age input
        try {
            System.out.print("\nEnter student age: ");

            int age = sc.nextInt();

            System.out.println("Student Age: " + age);

        } catch (InputMismatchException e) {

            System.out.println("Error: Please enter age as a number.");

            // Remove invalid input from Scanner
            sc.nextLine();
        }


        // 3. Calculate average marks
        try {
            int totalMarks = 450;
            int numberOfSubjects = 0;

            int average = totalMarks / numberOfSubjects;

            System.out.println("Average Marks: " + average);

        } catch (ArithmeticException e) {

            System.out.println("Error: Cannot calculate average with zero subjects.");
        }


        // 4. Access array element
        try {
            int[] marks = {85, 90, 78, 88, 92};

            System.out.print("\nEnter marks index: ");
            int index = sc.nextInt();

            System.out.println("Marks: " + marks[index]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Invalid marks index.");
        }


        // finally block
        finallyBlockDemo();

        sc.close();
    }


    public static void finallyBlockDemo() {

        try {
            System.out.println("\nStudent portal operation completed.");

        } finally {
            System.out.println("Finally block executed.");
            System.out.println("Thank you for using the Student Portal.");
        }
    }
}