package com.oops;

import java.util.Scanner;

public class PassengerBookingDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String passengerID=sc.next();
		String ageStr=sc.next();
		try {
			int id=Integer.parseInt(passengerID);
			int age=Integer.parseInt(ageStr);
		}catch(NumberFormatException e) {
			
		}
	}

}
