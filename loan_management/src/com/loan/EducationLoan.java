package com.loan;

public class EducationLoan extends LoanImpl {

    private String courseName;

    private String institutionName;

    public EducationLoan(int loanId,
                         String customerName,
                         double loanAmount,
                         int tenure,
                         String courseName,
                         String institutionName) {

        super(loanId, customerName, loanAmount, tenure);

        this.courseName = courseName;
        this.institutionName = institutionName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {

        if (courseName == null || courseName.isBlank()) {
            throw new IllegalArgumentException(
                    "Course name cannot be empty");
        }

        this.courseName = courseName;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {

        if (institutionName == null || institutionName.isBlank()) {
            throw new IllegalArgumentException(
                    "Institution name cannot be empty");
        }

        this.institutionName = institutionName;
    }

    @Override
    public double getInterestRate() {
        return 7.5;
    }

    @Override
    public void applyLoan() {

        System.out.println(
                "Education loan application submitted.");
    }

    @Override
    public void displayLoanDetails() {

        super.displayLoanDetails();

        System.out.println(
                "Course Name    : " + courseName);
        System.out.println(
                "Institution     : " + institutionName);
        System.out.println(
                "Loan Type      : Education Loan");
        System.out.println("===================================");
    }
}