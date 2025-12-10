package com.example.bilabonnement.dataRegistration.model;

// DamageItem.java
import java.math.BigDecimal;

public class DamageItem {

    private int damageItemId;
    private String description;
    private double damageItemPrice;
    private int damageReportId;

    public DamageItem() {
    }

    // Getters and setters

    public int getDamageItemId() {
        return damageItemId;
    }

    public void setDamageItemId(int damageItemId) {
        this.damageItemId = damageItemId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDamageItemPrice() {
        return damageItemPrice;
    }

    public void setDamageItemPrice(double damageItemPrice) {
        this.damageItemPrice = damageItemPrice;
    }

    public int getDamageReportId() {
        return damageReportId;
    }

    public void setDamageReportId(int damageReportId) {
        this.damageReportId = damageReportId;
    }
}
