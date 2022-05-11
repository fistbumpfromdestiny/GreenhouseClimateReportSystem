package com.example.greenhouse.service;

import com.example.greenhouse.model.Humidity;

import java.util.List;

public interface HumidityService {
    List<Humidity> findRH(long id);
    Humidity findTopRH(long id);
}
