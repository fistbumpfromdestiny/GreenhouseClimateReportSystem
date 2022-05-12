package com.example.greenhouse.repository;

import com.example.greenhouse.model.Humidity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HumidityRepository extends JpaRepository<Humidity, Long> {

    Humidity findTop1ByGreenhouse_IdOrderByDateDesc(long id);

    @Query(value = "SELECT avg(rh) FROM Humidity WHERE greenhouse.id = :id" )
    double averageRHbyGreenhouseID(@Param("id") long id);
}