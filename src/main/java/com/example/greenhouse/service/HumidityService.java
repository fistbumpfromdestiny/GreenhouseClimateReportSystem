package com.example.greenhouse.service;

import com.example.greenhouse.model.AverageMeasurement;
import com.example.greenhouse.model.Humidity;

import java.util.List;

public interface HumidityService {

    Humidity findTop1ByGreenhouseID(long id);
    double findAveragePerGH(long id);
    List<AverageMeasurement> findDailyAveragePerGH(long id);

}
