package com.example.greenhouse.controller;

import com.example.greenhouse.repository.ElectricityRepository;
import com.example.greenhouse.service.ElectricityService;
import com.example.greenhouse.service.GreenhouseService;
import com.example.greenhouse.service.HumidityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GreenhouseController {

    private final GreenhouseService greenhouseService;
    private final HumidityService humidityService;
    private final ElectricityService electricityService;


    @Autowired
    public GreenhouseController(GreenhouseService greenhouseService, HumidityService humidityService,
                                ElectricityRepository electricityRepository, ElectricityService electricityService) {
        this.greenhouseService = greenhouseService;
        this.humidityService = humidityService;
        this.electricityService = electricityService;
    }

    // Displays list of all employees
    @RequestMapping("/")
    public ModelAndView viewHomePage() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listGreenhouses", greenhouseService.getAllGreenhouses());
        mav.addObject("currPrice", electricityService.currentElectricityPrice());
        return mav;
    }
    @RequestMapping("/showReport/{id}")
    public ModelAndView showReport(@PathVariable(value="id") long id) {
        ModelAndView mav = new ModelAndView("showreport");
        mav.addObject("report", humidityService.findByGreenhouseID(id));

        return mav;

    }
}
