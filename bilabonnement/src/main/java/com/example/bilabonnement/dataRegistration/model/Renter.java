package com.example.bilabonnement.dataRegistration.model;

import com.example.bilabonnement.dataRegistration.CreditScore;

// Renter.java
public class Renter extends Customer {

    private int renterId;
    private CreditScore creditScore;
    private String ssn;

    public Renter() {
    }

    // Getters and setters

    public int getRenterId() {
        return renterId;
    }

    public void setRenterId(int renterId) {
        this.renterId = renterId;
    }

    public CreditScore getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(CreditScore creditScore) {
        this.creditScore = creditScore;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
