package com.example.greenhouse.service;

import com.example.greenhouse.model.Humidity;
import com.example.greenhouse.repository.HumidityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumidityServiceImpl implements HumidityService {

    private final HumidityRepository humidityRepository;

    @Autowired
    public HumidityServiceImpl(HumidityRepository humidityRepository) {
        this.humidityRepository = humidityRepository;
    }


}