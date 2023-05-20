package com.example.librarytrack;

public class PremiumBooks extends Books {
    public PremiumBooks(int numberOfDays) {
        super(numberOfDays);
    }

    public void computePayment() {
        int totalPremiumPayment;
        totalPremiumPayment = (int) (50.00 * (7 + (getNumberOfDays() - 7)) + 25.00 * (getNumberOfDays() - 7));

        setTotalPayment(totalPremiumPayment);
    }

}