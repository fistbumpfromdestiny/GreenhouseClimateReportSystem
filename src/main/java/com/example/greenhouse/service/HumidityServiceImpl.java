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


    @Override
    public List<Humidity> findRH(long id) {
        return humidityRepository.findHumidityByGreenhouseId(id);
    }

    @Override
    public Humidity findTopRH(long id) {
        return humidityRepository.findTopByGreenhouseId(id);
    }
}