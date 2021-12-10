package com.arsenic.weatherapi;

import com.arsenic.weatherapi.helpers.MoreInfo;


public class WeatherData {
    private final String weather;
    private final String temperature;
    private final String airQuality;
    private final String lastUpdate;
    private final String city;
    private final MoreInfo details;

    public WeatherData(String city, String temperature, String aqi, String weather, String lastUpdate, MoreInfo details) {
        this.city = city;
        this.airQuality = aqi;
        this.weather = weather;
        this.temperature = temperature;
        this.details = details;
        this.lastUpdate = lastUpdate;
    }

    public MoreInfo getDetails() {
        return details;
    }

    public String getCity() {
        return city;
    }

    public String getWeather() {
        return weather;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getAirQuality() {
        return airQuality;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }
}
