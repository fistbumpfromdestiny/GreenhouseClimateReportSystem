package com.example.greenhouse.repository;

import com.example.greenhouse.model.Electricity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectricityRepository extends JpaRepository<Electricity, Long> {

}
