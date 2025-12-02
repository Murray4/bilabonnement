package com.example.bilabonnement.forms.damageReportForm.model;

import java.math.BigDecimal;

public class DamageItem {

    private int damageItemId;
    private String description;
    private BigDecimal damageItemPrice;
    private int damageReportId;  // FK → DamageReport


    // --- Getters and Setters ---

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

    public BigDecimal getDamageItemPrice() {
        return damageItemPrice;
    }

    public void setDamageItemPrice(BigDecimal damageItemPrice) {
        this.damageItemPrice = damageItemPrice;
    }

    public int getDamageReportId() {
        return damageReportId;
    }

    public void setDamageReportId(int damageReportId) {
        this.damageReportId = damageReportId;
    }
}
