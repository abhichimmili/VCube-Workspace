package com.loan;

public abstract class LoanImpl implements Loan {

    // Encapsulation
    private int loanId;
    private String customerName;
    private double loanAmount;
    private int tenure;

    // Parameterized constructor
    public LoanImpl(int loanId, String customerName,
                    double loanAmount, int tenure) {

        this.loanId = loanId;
        this.customerName = customerName;
        this.loanAmount = loanAmount;
        this.tenure = tenure;
    }

    // Getters and setters

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        if (loanId <= 0) {
            throw new IllegalArgumentException(
                    "Loan ID must be greater than 0");
        }

        this.loanId = loanId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {

        if (customerName == null || customerName.isBlank()) {
            throw new IllegalArgumentException(
                    "Customer name cannot be empty");
        }

        this.customerName = customerName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {

        if (loanAmount <= 0) {
            throw new IllegalArgumentException(
                    "Loan amount must be greater than 0");
        }

        this.loanAmount = loanAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {

        if (tenure <= 0) {
            throw new IllegalArgumentException(
                    "Tenure must be greater than 0");
        }

        this.tenure = tenure;
    }

    // Abstract method
    // Every loan type must provide its own interest rate.
    public abstract double getInterestRate();

    // Common implementation
    @Override
    public void applyLoan() {

        System.out.println("Loan application submitted successfully.");
    }

    // Common interest calculation
    @Override
    public void calculateInterest() {

        double interest =
                loanAmount * getInterestRate() * tenure / 100;

        System.out.println(
                "Total Interest : " + interest);
    }

    // Common EMI calculation
    @Override
    public void calculateEMI() {

        double monthlyRate =
                getInterestRate() / (12 * 100);

        int numberOfMonths = tenure * 12;

        double emi;

        if (monthlyRate == 0) {

            emi = loanAmount / numberOfMonths;

        } else {

            emi = (loanAmount
                    * monthlyRate
                    * Math.pow(1 + monthlyRate, numberOfMonths))
                    / (Math.pow(1 + monthlyRate, numberOfMonths) - 1);
        }

        System.out.printf(
                "Monthly EMI    : %.2f%n", emi);
    }

    // Common display method
    @Override
    public void displayLoanDetails() {

        System.out.println();
        System.out.println("========== LOAN DETAILS ==========");

        System.out.println("Loan ID        : " + loanId);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Loan Amount    : " + loanAmount);
        System.out.println("Tenure         : " + tenure + " years");
        System.out.println("Interest Rate  : " + getInterestRate() + "%");

        System.out.println("===================================");
    }

    // Method Overloading
    public void displayLoanDetails(boolean showInterest) {

        displayLoanDetails();

        if (showInterest) {
            calculateInterest();
        }
    }

    @Override
    public String toString() {

        return "Loan ID: " + loanId
                + ", Customer Name: " + customerName
                + ", Loan Amount: " + loanAmount
                + ", Tenure: " + tenure;
    }
}