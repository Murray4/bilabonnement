package com.example.bilabonnement.businessDeveloper.service;

import com.example.bilabonnement.businessDeveloper.model.BusinessDevDashboard;
import com.example.bilabonnement.businessDeveloper.repository.BusinessDevRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessDevService {

    @Autowired
    BusinessDevRepository devRepo;

    public int getTotalRentedCars(){
        return devRepo.getTotalRentedCars();
    }

    public int getTotalReturnsToday(){
        return devRepo.getTotalReturnsToday();
    }

    public BusinessDevDashboard getDashboard(){

        BusinessDevDashboard dashboard = new BusinessDevDashboard();

        //mvp:
        dashboard.setTotalRentedCars(devRepo.getTotalRentedCars());
        dashboard.setTotalValueOfRentedCars(devRepo.getTotalCarValueOfRentedCars());

        //Hvor mange returneringer i dag:
        dashboard.setTotalReturnsToday(getTotalReturnsToday());

        //Hvor mange biler solgt i år:
        dashboard.setCarsSoldThisYear(devRepo.getCarsSoldThisYear());

        //"generelle kpi'er":

        dashboard.setCarsReadyForRent(devRepo.getCarCountByStatus("READY_FOR_RENT"));
        dashboard.setCarsInPreparationForRent(devRepo.getCarCountByStatus("PREPARATION_FOR_RENT"));
        dashboard.setCarsReturned(devRepo.getCarCountByStatus("RETURNED"));
        dashboard.setCarsReadyForSale(devRepo.getCarCountByStatus("READY_FOR_SALE"));
        dashboard.setCarsSold(devRepo.getCarCountByStatus("SOLD"));


        return dashboard;
    }








}
