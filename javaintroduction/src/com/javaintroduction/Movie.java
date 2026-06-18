package com.javaintroduction;

public class Movie {
	
	// static variable
	static String industryName;
	
	//instance variable
	int movieId;
	String movieName;
	
	public static void main(String[] args) {
		industryName="Tollywood";
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
		Movie m4 = new Movie();
		Movie m5 = new Movie();
		Movie m6 = new Movie();
		m1.movieId = 101;
		m1.movieName="Pushpa";
		System.out.println(m1.movieId+" : "+ m1.movieName+" : "+m1.industryName);
		m2.movieId = 102;
		m2.movieName="RRR";
		System.out.println(m2.movieId+" : "+ m2.movieName+" : "+m2.industryName);
		m3.movieId = 103;
		m3.movieName="Peddi";
		System.out.println(m3.movieId+" : "+ m3.movieName+" : "+m3.industryName);
		m4.movieId = 104;
		m4.movieName="Hi Nanna";
		System.out.println(m4.movieId+" : "+ m4.movieName+" : "+m4.industryName);
		m4.industryName="Bollywood";
		m5.movieId = 105;
		m5.movieName="Super 30";
		System.out.println(m5.movieId+" : "+ m5.movieName+" : "+m5.industryName);
		m6.movieId = 106;
		m6.movieName="Yeh Jawaani Hai Deewani";
		System.out.println(m6.movieId+" : "+ m6.movieName+" : "+m6.industryName);
		
	}

}
