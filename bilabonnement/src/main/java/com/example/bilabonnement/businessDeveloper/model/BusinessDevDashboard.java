package com.example.bilabonnement.businessDeveloper.model;

import java.math.BigDecimal;

public class BusinessDevDashboard {

    private int totalRentedCars;
    private BigDecimal totalValueOfRentedCars;

    private int totalReturnsToday;

    private int actualReturnsToday;

    private int carsSoldThisYear;

    //Generelle kpi'er:
    private int carsReadyForRent;
    private int carsInPreparationForRent;
    private int carsRented;
    private int carsReturned;
    private int carsReadyForSale;
    private int carsSold;
    private int purchasedCars;
    private int carsInPreparationForSale;


    public int getTotalRentedCars() {
        return totalRentedCars;
    }

    public void setTotalRentedCars(int totalRentedCars) {
        this.totalRentedCars = totalRentedCars;
    }

    public BigDecimal getTotalValueOfRentedCars() {
        return totalValueOfRentedCars;
    }

    public void setTotalValueOfRentedCars(BigDecimal totalValueOfRentedCars) {
        this.totalValueOfRentedCars = totalValueOfRentedCars;
    }

    public int getTotalReturnsToday() {
        return totalReturnsToday;
    }

    public void setTotalReturnsToday(int totalReturnsToday) {
        this.totalReturnsToday = totalReturnsToday;
    }

    public int getActualReturnsToday() {
        return actualReturnsToday;
    }

    public void setActualReturnsToday(int actualReturnsToday) {
        this.actualReturnsToday = actualReturnsToday;
    }

    public int getCarsReadyForRent() {
        return carsReadyForRent;
    }

    public void setCarsReadyForRent(int carsReadyForRent) {
        this.carsReadyForRent = carsReadyForRent;
    }

    public int getCarsInPreparationForRent() {
        return carsInPreparationForRent;
    }

    public void setCarsInPreparationForRent(int carsInPreparationForRent) {
        this.carsInPreparationForRent = carsInPreparationForRent;
    }

    public int getCarsRented() {
        return carsRented;
    }

    public void setCarsRented(int carsRented) {
        this.carsRented = carsRented;
    }

    public int getCarsReturned() {
        return carsReturned;
    }

    public void setCarsReturned(int carsReturned) {
        this.carsReturned = carsReturned;
    }

    public int getCarsReadyForSale() {
        return carsReadyForSale;
    }

    public void setCarsReadyForSale(int carsReadyForSale) {
        this.carsReadyForSale = carsReadyForSale;
    }

    public int getCarsSold() {
        return carsSold;
    }

    public void setCarsSold(int carsSold) {
        this.carsSold = carsSold;
    }

    public int getCarsSoldThisYear() {
        return carsSoldThisYear;
    }

    public void setCarsSoldThisYear(int carsSoldThisYear) {
        this.carsSoldThisYear = carsSoldThisYear;
    }

    public int getPurchasedCars() {
        return purchasedCars;
    }

    public void setPurchasedCars(int purchasedCars) {
        this.purchasedCars = purchasedCars;
    }

    public int getCarsInPreparationForSale() {
        return carsInPreparationForSale;
    }

    public void setCarsInPreparationForSale(int carsInPreparationForSale) {
        this.carsInPreparationForSale = carsInPreparationForSale;
    }
}


