package com.example.bilabonnement.dataRegistration.model;

// DamageReport.java
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DamageReport {

    private int damageReportId;
    private BigDecimal totalPrice;
    private BigDecimal totalDamagePrice;
    private LocalDate reportDate;
    private boolean lateReturn;
    private int totalKm;
    private LocalDateTime hasPayed;
    private int leasingContractId;

    public DamageReport() {
    }

    // Getters and setters

    public int getDamageReportId() {
        return damageReportId;
    }

    public void setDamageReportId(int damageReportId) {
        this.damageReportId = damageReportId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalDamagePrice() {
        return totalDamagePrice;
    }

    public void setTotalDamagePrice(BigDecimal totalDamagePrice) {
        this.totalDamagePrice = totalDamagePrice;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public boolean isLateReturn() {
        return lateReturn;
    }

    public void setLateReturn(boolean lateReturn) {
        this.lateReturn = lateReturn;
    }

    public int getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(int totalKm) {
        this.totalKm = totalKm;
    }

    public LocalDateTime getHasPayed() {
        return hasPayed;
    }

    public void setHasPayed(LocalDateTime hasPayed) {
        this.hasPayed = hasPayed;
    }

    public int getLeasingContractId() {
        return leasingContractId;
    }

    public void setLeasingContractId(int leasingContractId) {
        this.leasingContractId = leasingContractId;
    }
}
