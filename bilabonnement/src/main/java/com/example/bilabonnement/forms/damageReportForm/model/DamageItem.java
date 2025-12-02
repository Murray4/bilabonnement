package com.example.bilabonnement.forms.damageReportForm.model;

import jakarta.persistence.*;

@Entity
public class DamageItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long damageItem_ID;

    private String description;
    private double damageItemPrice;

    @ManyToOne
    @JoinColumn(name = "damageReport_ID")
    private DamageReport damageReport;


// Getters & Setters


    public Long getDamageItem_ID() {
        return damageItem_ID;
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

    public DamageReport getDamageReport() {
        return damageReport;
    }

    // ✔ nødvendig for at sætte parent relation
    public void setDamageReport(DamageReport damageReport) {
        this.damageReport = damageReport;
    }
}
