package com.example.greenhouse.service;

import com.example.greenhouse.model.Greenhouse;
import com.example.greenhouse.repository.GreenhouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreenhouseServiceImpl implements GreenhouseService {

    private final GreenhouseRepository greenhouseRepository;

    @Autowired
    public GreenhouseServiceImpl(GreenhouseRepository greenhouseRepository) {
        this.greenhouseRepository = greenhouseRepository;
    }

    @Override
    public List<Greenhouse> getAllGreenhouses() {
        return greenhouseRepository.findAll();
    }

}
