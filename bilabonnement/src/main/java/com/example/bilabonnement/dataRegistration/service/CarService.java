package com.example.bilabonnement.dataRegistration.service;


import com.example.bilabonnement.dataRegistration.model.view.CarView;
import com.example.bilabonnement.dataRegistration.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }


    public List<CarView> listAllCars(){
        return carRepository.fetchAllCars();
    }

    public List<CarView> listAllCarsByStatus(String status){
        return carRepository.fetchCarsByStatus(status);
    }

    //Hent detaljer om specifik bil ud fra id:
    public CarView findCarById(int vehicleId){
        return carRepository.fetchCarById(vehicleId);
    }

    //Ændre status på en bil manuelt i status_histories:
    public boolean changeCarStatus(int vehicleId, String status){
        return carRepository.insertStatusHistory(vehicleId, status);
    }

}
