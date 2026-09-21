package com.loan;

public class PersonalLoan extends LoanImpl {

    private String purpose;

    public PersonalLoan(int loanId,
                        String customerName,
                        double loanAmount,
                        int tenure,
                        String purpose) {

        super(loanId, customerName, loanAmount, tenure);

        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {

        if (purpose == null || purpose.isBlank()) {
            throw new IllegalArgumentException(
                    "Purpose cannot be empty");
        }

        this.purpose = purpose;
    }

    @Override
    public double getInterestRate() {
        return 11.5;
    }

    @Override
    public void applyLoan() {

        System.out.println(
                "Personal loan application submitted.");
    }

    @Override
    public void displayLoanDetails() {

        super.displayLoanDetails();

        System.out.println(
                "Purpose        : " + purpose);
        System.out.println(
                "Loan Type      : Personal Loan");
        System.out.println("===================================");
    }
}