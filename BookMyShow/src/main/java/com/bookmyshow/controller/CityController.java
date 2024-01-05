package com.bookmyshow.controller;

import com.bookmyshow.model.City;
import com.bookmyshow.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CityController {
    @Autowired
    private CityService cityService;

    public City addCity(String name){
        return cityService.addCity(name);
    }
}
