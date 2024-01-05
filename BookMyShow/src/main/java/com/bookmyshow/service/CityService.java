package com.bookmyshow.service;

import com.bookmyshow.model.City;
import com.bookmyshow.repository.CityRepository;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    private CityRepository cityRepository;
    public City addCity(String name){
        City city = new City(name);
        return cityRepository.save(city);
    }
}
