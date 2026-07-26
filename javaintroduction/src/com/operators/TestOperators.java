package com.operators;

public class TestOperators {

	public static void main(String[] args) {
		int total_seconds= 68000;
		int hours=total_seconds/3600;
		int rem_mins=total_seconds%3600;
		int mins=rem_mins/60;
		int rem_secs=rem_mins%60;
		int secs=rem_secs;
		System.out.println(total_seconds+" is "+hours+" : "+mins+" : "+secs);
		
	}

}
