package com.example.greenhouse.controller;

import com.example.greenhouse.model.Greenhouse;
import com.example.greenhouse.model.Monitor;
import com.example.greenhouse.repository.ElectricityRepository;
import com.example.greenhouse.service.ElectricityService;
import com.example.greenhouse.service.GreenhouseService;
import com.example.greenhouse.service.HumidityService;
import com.example.greenhouse.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@RestController
public class GreenhouseController {

    private final GreenhouseService greenhouseService;
    private final HumidityService humidityService;
    private final ElectricityService electricityService;
    private final TemperatureService temperatureService;


    @Autowired
    public GreenhouseController(GreenhouseService greenhouseService,
                                HumidityService humidityService,
                                ElectricityService electricityService,
                                TemperatureService temperatureService) {

        this.greenhouseService = greenhouseService;
        this.humidityService = humidityService;
        this.electricityService = electricityService;
        this.temperatureService = temperatureService;
    }

    // Displays list of all employees
    @RequestMapping("/")
    public ModelAndView viewHomePage() {

        ArrayList<Greenhouse> greenhouses = (ArrayList<Greenhouse>) greenhouseService.getAllGreenhouses();
        ArrayList<Monitor> monitorList = new ArrayList<>();

        int size = greenhouses.size();
        for(int i = 0; i < size; i++) {

            Monitor m = new Monitor();
            m.setId(greenhouses.get(i).getId());
            m.setName(greenhouses.get(i).getName());
            m.setRh(humidityService.findTop1ByGreenhouseID(i+1).getRh());
            m.setTemp(temperatureService.findTop1ByGreenhouseID(i+1).getTemp());
            m.setAvg_rh(humidityService.findAveragePerGH(greenhouses.get(i).getId()));
            m.setAvg_temp(temperatureService.findAveragePerGH(greenhouses.get(i).getId()));
            monitorList.add(m);
        }

        ModelAndView mav = new ModelAndView("index");
        mav.addObject("monitor", monitorList);
        mav.addObject("currPrice", electricityService.currentElectricityPrice());
        return mav;
    }
    @RequestMapping("/showReport/{id}")
    public ModelAndView showReport(@PathVariable(value="id") long id) {

        ModelAndView mav = new ModelAndView("showreport");
        mav.addObject("tempReport", temperatureService.findDailyAveragePerGH(id));

        return mav;
    }
}
