package com.loan;

public class HomeLoan extends LoanImpl {

    private double propertyValue;

    public HomeLoan(int loanId,
                    String customerName,
                    double loanAmount,
                    int tenure,
                    double propertyValue) {

        super(loanId, customerName, loanAmount, tenure);

        this.propertyValue = propertyValue;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(double propertyValue) {

        if (propertyValue <= 0) {
            throw new IllegalArgumentException(
                    "Property value must be greater than 0");
        }

        this.propertyValue = propertyValue;
    }

    @Override
    public double getInterestRate() {
        return 8.5;
    }

    @Override
    public void applyLoan() {

        System.out.println(
                "Home loan application submitted.");
    }

    @Override
    public void displayLoanDetails() {

        super.displayLoanDetails();

        System.out.println(
                "Property Value : " + propertyValue);
        System.out.println(
                "Loan Type      : Home Loan");
        System.out.println("===================================");
    }
}