package com.example.greenhouse.repository;

import com.example.greenhouse.model.AverageMeasurement;
import com.example.greenhouse.model.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemperatureRepository extends JpaRepository<Temperature, Long> {

    Temperature findTop1ByGreenhouse_IdOrderByDateDesc(long id);

    @Query(value = "SELECT avg(temp) FROM Temperature WHERE greenhouse.id = :id" )
    double averageTempByGreenhouseID(@Param("id") long id);


    @Query("SELECT new com.example.greenhouse.model.AverageMeasurement(AVG(t.temp), DATE(t.date)) " +
            "FROM Temperature t " +
            "WHERE t.greenhouse.id = :id " +
            "GROUP BY DATE(t.date)")
    List<AverageMeasurement> avgTempPerDays(@Param("id") long id);
}

