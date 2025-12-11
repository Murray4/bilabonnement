package com.example.bilabonnement.dataRegistration.service;


import com.example.bilabonnement.dataRegistration.model.view.CarView;
import com.example.bilabonnement.dataRegistration.repository.CarRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepo carRepo;

    public CarService(CarRepo carRepo){
        this.carRepo = carRepo;
    }


    public List<CarView> listAllCars(){
        return carRepo.fetchAllCars();
    }

    public List<CarView> listAllCarsByStatus(String status){
        return carRepo.fetchCarsByStatus(status);
    }

    //Hent detaljer om specifik bil ud fra id:
    public CarView findCarById(int vehicleId){
        return carRepo.fetchCarById(vehicleId);
    }

    //Ændre status på en bil manuelt i status_histories:
    public boolean changeCarStatus(int vehicleId, String status){
        return carRepo.insertStatusHistory(vehicleId, status);
    }

}
