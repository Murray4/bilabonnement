package com.example.bilabonnement.dataRegistration.model;

// PreSaleAgreement.java
import com.example.bilabonnement.dataRegistration.Currency;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PreSaleAgreement {

    private int preSaleId;
    private boolean limitedPeriod;
    private LocalDate preSaleAgreementDate;
    private String pickupLocation;
    private int kmLimit;
    private BigDecimal extraKmPrice;
    private String preSaleAgreementTerms;
    private Currency currency;
    private LocalDate dateOfPurchase;
    private int vehicleId;
    private int customerId;

    public PreSaleAgreement() {
    }

    // Getters and setters

    public int getPreSaleId() {
        return preSaleId;
    }

    public void setPreSaleId(int preSaleId) {
        this.preSaleId = preSaleId;
    }

    public boolean isLimitedPeriod() {
        return limitedPeriod;
    }

    public void setLimitedPeriod(boolean limitedPeriod) {
        this.limitedPeriod = limitedPeriod;
    }

    public LocalDate getPreSaleAgreementDate() {
        return preSaleAgreementDate;
    }

    public void setPreSaleAgreementDate(LocalDate preSaleAgreementDate) {
        this.preSaleAgreementDate = preSaleAgreementDate;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public int getKmLimit() {
        return kmLimit;
    }

    public void setKmLimit(int kmLimit) {
        this.kmLimit = kmLimit;
    }

    public BigDecimal getExtraKmPrice() {
        return extraKmPrice;
    }

    public void setExtraKmPrice(BigDecimal extraKmPrice) {
        this.extraKmPrice = extraKmPrice;
    }

    public String getPreSaleAgreementTerms() {
        return preSaleAgreementTerms;
    }

    public void setPreSaleAgreementTerms(String preSaleAgreementTerms) {
        this.preSaleAgreementTerms = preSaleAgreementTerms;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
