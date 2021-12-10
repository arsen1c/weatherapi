package com.arsenic.weatherapi.controllers;

import com.arsenic.weatherapi.WeatherData;
import com.arsenic.weatherapi.helpers.GetAllData;
import com.arsenic.weatherapi.services.WeatherScraper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherDataController {
    @RequestMapping("/weather")
    public WeatherData weather() throws Exception {
        WeatherScraper scraper = new WeatherScraper();
        GetAllData weatherData = scraper.getData();

        return new WeatherData(weatherData.city, weatherData.aqi);
    }
}
