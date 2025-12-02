package com.example.bilabonnement.forms.damageReportForm.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class DamageReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long damageReport_ID;   // ← SKIFTET TIL Long

    private Long leasingContract_ID;

    private LocalDate reportDate;
    private LocalDate returnDate;

    private int totalKm;

    private double totalDamagePrice;
    private double totalPrice;

    private boolean hasPayed;

    @OneToMany(mappedBy = "damageReport", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DamageItem> damageItems = new ArrayList<>();


    // --- getters & setters ---

    // ✔ kun getter, ingen setter — perfekt til auto increment
    public Long getDamageReport_ID() {
        return damageReport_ID;
    }

    public Long getLeasingContract_ID() {
        return leasingContract_ID;
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

    public List<DamageItem> getDamageItems() {
        return damageItems;
    }

    public void setDamageItems(List<DamageItem> damageItems) {
        this.damageItems = damageItems;
    }
}
