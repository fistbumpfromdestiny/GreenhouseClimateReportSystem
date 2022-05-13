package com.example.greenhouse.repository;

import com.example.greenhouse.model.AverageMeasurement;
import com.example.greenhouse.model.Humidity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumidityRepository extends JpaRepository<Humidity, Long> {

    Humidity findTop1ByGreenhouse_IdOrderByDateDesc(long id);

    // Query for total average independent of date

    @Query(value = "SELECT avg(rh) FROM Humidity WHERE greenhouse.id = :id" )
    double averageRHbyGreenhouseID(@Param("id") long id);

    /* Query for average humidity grouped by day. Casts to DATE to disregard time differences
     * within same dates */

    @Query("SELECT new com.example.greenhouse.model.AverageMeasurement(AVG(rh), DATE(date)) " +
            "FROM Humidity " +
            "WHERE greenhouse.id = :id " +
            "GROUP BY DATE(date)")
    List<AverageMeasurement> avgHumidityPerDays(@Param("id") long id);
}