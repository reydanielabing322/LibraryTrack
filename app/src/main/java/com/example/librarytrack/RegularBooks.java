package com.example.librarytrack;

public class RegularBooks extends Books {
    public RegularBooks(int numberOfDays) {
        super(numberOfDays);
    }

    public void computePayment() {
        int totalRegularPayment;
        totalRegularPayment = 20 * getNumberOfDays();

        setTotalPayment(totalRegularPayment);
}
    }