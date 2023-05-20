package com.example.librarytrack;

public class Books {
    private int numberOfDays;
    private int totalPayment;
    private  int rate = 20;

    public Books(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setTotalPayment(int totalPayment){
        this.totalPayment = totalPayment;
    }

    public void computePayment() {
        this.totalPayment = numberOfDays * rate;
    }

    public int returnPayment() {
        return totalPayment;
    }


}

