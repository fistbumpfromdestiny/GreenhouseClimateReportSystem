package com.example.greenhouse.controller;

import com.example.greenhouse.service.GreenhouseService;
import com.example.greenhouse.service.HumidityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GreenhouseController {

    private final GreenhouseService greenhouseService;


    @Autowired
    public GreenhouseController(GreenhouseService greenhouseService) {
        this.greenhouseService = greenhouseService;
    }


    // Displays list of all employees
    @RequestMapping("/")
    public ModelAndView viewHomePage() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listGreenhouses", greenhouseService.getAllGreenhouses());
        return mav;
    }
}
