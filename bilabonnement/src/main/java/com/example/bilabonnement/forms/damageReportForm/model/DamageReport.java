package com.example.bilabonnement.forms.damageReportForm.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DamageReport {

    private int damageReportId;

    private LocalDate reportDate;
    private LocalDate returnDate;    // ✔ bruges til at beregne late return

    private int totalKm;

    private double totalDamagePrice;
    private double totalPrice;

    private boolean hasPayed;

    private int leasingContractId;

    private List<DamageItem> damageItems = new ArrayList<>();

    // --- getters & setters ---

    public int getDamageReportId() {
        return damageReportId;
    }

    public void setDamageReportId(int damageReportId) {
        this.damageReportId = damageReportId;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(int totalKm) {
        this.totalKm = totalKm;
    }

    public double getTotalDamagePrice() {
        return totalDamagePrice;
    }

    public void setTotalDamagePrice(double totalDamagePrice) {
        this.totalDamagePrice = totalDamagePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isHasPayed() {
        return hasPayed;
    }

    public void setHasPayed(boolean hasPayed) {
        this.hasPayed = hasPayed;
    }

    public int getLeasingContractId() {
        return leasingContractId;
    }

    public void setLeasingContractId(int leasingContractId) {
        this.leasingContractId = leasingContractId;
    }

    public List<DamageItem> getDamageItems() {
        return damageItems;
    }

    public void setDamageItems(List<DamageItem> damageItems) {
        this.damageItems = damageItems;
    }
}