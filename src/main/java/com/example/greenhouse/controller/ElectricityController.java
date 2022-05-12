package com.example.greenhouse.controller;

import com.example.greenhouse.model.Electricity;
import com.example.greenhouse.service.ElectricityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ElectricityController {

    private final ElectricityService electricityService;

    @Autowired
    public ElectricityController(ElectricityService electricityService) {
        this.electricityService = electricityService;
    }

    @RequestMapping("/updateSpotPrice")
    public ModelAndView updateSpotPrice() {

        ModelAndView mav = new ModelAndView("new_spotprice");
        Electricity electricity = new Electricity();
        mav.addObject("electricity", electricity);
        return mav;
    }

    @PostMapping("/saveSpotPrice")
    public ModelAndView saveEmployee(@ModelAttribute("electricity") Electricity electricity) {

        electricityService.saveSpotPrice(electricity);
        return new ModelAndView("redirect:/");
    }
}
