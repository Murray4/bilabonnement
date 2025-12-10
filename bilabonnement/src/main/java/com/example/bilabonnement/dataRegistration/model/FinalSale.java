package com.example.bilabonnement.dataRegistration.model;

// FinalSale.java
import com.example.bilabonnement.dataRegistration.BuyerType;
import com.example.bilabonnement.dataRegistration.Currency;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FinalSale {

    private int finalSaleId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String address;
    private int zip;
    private String floor;
    private String country;
    private LocalDate saleDate;
    private BuyerType buyerType;
    private Currency currency;
    private String note;
    private BigDecimal finalSalePrice;
    private int vehicleId;

    public FinalSale() {
    }

    // Getters and setters

    public int getFinalSaleId() {
        return finalSaleId;
    }

    public void setFinalSaleId(int finalSaleId) {
        this.finalSaleId = finalSaleId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public BuyerType getBuyerType() {
        return buyerType;
    }

    public void setBuyerType(BuyerType buyerType) {
        this.buyerType = buyerType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public BigDecimal getFinalSalePrice() {
        return finalSalePrice;
    }

    public void setFinalSalePrice(BigDecimal finalSalePrice) {
        this.finalSalePrice = finalSalePrice;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
}
