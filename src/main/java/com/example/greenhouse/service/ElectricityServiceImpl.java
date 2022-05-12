package com.example.greenhouse.service;

import com.example.greenhouse.repository.ElectricityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectricityServiceImpl implements ElectricityService{

    private final ElectricityRepository electricityRepository;

    @Autowired
    public ElectricityServiceImpl(ElectricityRepository electricityRepository) {
        this.electricityRepository = electricityRepository;
    }


}
