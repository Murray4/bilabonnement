package com.example.bilabonnement.dataRegistration.model.view;

public class CarView {

    private Integer vehicleId;
    private String chassisNumber;
    private String brand;
    private String model;
    private String equipmentLevel;
    private Double steelPrice;
    private Double registrationTax;
    private Integer co2Emission;
    private Integer mileage;
    private String leasingCode;
    private String irkCode;
    private String dateOfPurchase;
    private Double purchasePrice;

    private String carStatus;

    private Integer leaseContractId;

    private String approvedDate;


    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEquipmentLevel() {
        return equipmentLevel;
    }

    public void setEquipmentLevel(String equipmentLevel) {
        this.equipmentLevel = equipmentLevel;
    }

    public Double getSteelPrice() {
        return steelPrice;
    }

    public void setSteelPrice(Double steelPrice) {
        this.steelPrice = steelPrice;
    }

    public Double getRegistrationTax() {
        return registrationTax;
    }

    public void setRegistrationTax(Double registrationTax) {
        this.registrationTax = registrationTax;
    }

    public Integer getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(Integer co2Emission) {
        this.co2Emission = co2Emission;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getLeasingCode() {
        return leasingCode;
    }

    public void setLeasingCode(String leasingCode) {
        this.leasingCode = leasingCode;
    }

    public String getIrkCode() {
        return irkCode;
    }

    public void setIrkCode(String irkCode) {
        this.irkCode = irkCode;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public Integer getLeaseContractId() {
        return leaseContractId;
    }

    public void setLeaseContractId(Integer leaseContractId) {
        this.leaseContractId = leaseContractId;
    }

    public String getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(String approvedDate) {
        this.approvedDate = approvedDate;
    }
}
