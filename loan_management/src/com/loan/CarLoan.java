package com.loan;

public class CarLoan extends LoanImpl {

    private String carModel;

    private double carPrice;

    public CarLoan(int loanId,
                   String customerName,
                   double loanAmount,
                   int tenure,
                   String carModel,
                   double carPrice) {

        super(loanId, customerName, loanAmount, tenure);

        this.carModel = carModel;
        this.carPrice = carPrice;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {

        if (carModel == null || carModel.isBlank()) {
            throw new IllegalArgumentException(
                    "Car model cannot be empty");
        }

        this.carModel = carModel;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {

        if (carPrice <= 0) {
            throw new IllegalArgumentException(
                    "Car price must be greater than 0");
        }

        this.carPrice = carPrice;
    }

    @Override
    public double getInterestRate() {
        return 9.0;
    }

    @Override
    public void applyLoan() {

        System.out.println(
                "Car loan application submitted.");
    }

    @Override
    public void displayLoanDetails() {

        super.displayLoanDetails();

        System.out.println(
                "Car Model      : " + carModel);
        System.out.println(
                "Car Price      : " + carPrice);
        System.out.println(
                "Loan Type      : Car Loan");
        System.out.println("===================================");
    }
}