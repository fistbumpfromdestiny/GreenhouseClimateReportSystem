package com.example.greenhouse.repository;

import com.example.greenhouse.model.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemperatureRepository extends JpaRepository<Temperature, Long> {

    Temperature findTop1ByGreenhouse_IdOrderByDateDesc(long id);
}