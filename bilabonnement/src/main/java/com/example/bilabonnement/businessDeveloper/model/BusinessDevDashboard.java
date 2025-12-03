package com.example.bilabonnement.businessDeveloper.model;

import java.math.BigDecimal;

public class BusinessDevDashboard {

    private int totalRentedCars;
    private BigDecimal totalValueOfRentedCars;

    private int totalReturnsToday;

    private int carsSoldThisYear;

    //Generelle kpi'er:
    private int carsReadyForRent;
    private int carsInPreparationForRent;
    private int carsReturned;
    private int carsReadyForSale;
    private int carsSold;


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
}


