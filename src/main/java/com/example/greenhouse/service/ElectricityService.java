package com.example.greenhouse.service;

import com.example.greenhouse.model.Electricity;

public interface ElectricityService {

    Electricity currentElectricityPrice();

    void saveSpotPrice(Electricity electricity);

}
