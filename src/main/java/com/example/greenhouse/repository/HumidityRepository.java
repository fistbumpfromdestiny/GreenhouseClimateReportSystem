package com.example.greenhouse.repository;

import com.example.greenhouse.model.Humidity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumidityRepository extends JpaRepository<Humidity, Long> {
    List<Humidity> findHumidityByGreenhouseId(long id);
    Humidity findTopByGreenhouseId(long id);
}