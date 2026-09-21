package com.loan;


public interface Loan {
	
	public static final String BANK_NAME="ABC BANK";
	
	void applyLoan();
	
    void calculateInterest();

    void calculateEMI();

    void displayLoanDetails();
	
}
