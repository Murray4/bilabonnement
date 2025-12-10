package com.example.bilabonnement.dataRegistration.model;

// StatusHistory.java
import com.example.bilabonnement.dataRegistration.CarStatus;

import java.time.LocalDateTime;

public class StatusHistory {

    private int statusHistoryId;
    private CarStatus status;
    private LocalDateTime timestamp;
    private int vehicleId;

    public StatusHistory() {
    }

    // Getters and setters

    public int getStatusHistoryId() {
        return statusHistoryId;
    }

    public void setStatusHistoryId(int statusHistoryId) {
        this.statusHistoryId = statusHistoryId;
    }

    public CarStatus getStatus() {
        return status;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
}
