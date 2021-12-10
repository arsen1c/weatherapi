package com.arsenic.weatherapi.controllers;

import com.arsenic.weatherapi.WeatherData;
import com.arsenic.weatherapi.helpers.GetAllData;
import com.arsenic.weatherapi.services.WeatherScraper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherDataController {
    @Autowired
    WeatherScraper scraper;
    @RequestMapping("/weather")
    public WeatherData weather() throws Exception {
        GetAllData weatherData = scraper.getData();

        System.out.println(weatherData.details);
        return new WeatherData(weatherData.city, weatherData.temperature, weatherData.aqi, weatherData.weather, weatherData.lastUpdate, weatherData.details);
    }
}
