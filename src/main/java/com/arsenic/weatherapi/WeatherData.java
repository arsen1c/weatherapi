package com.arsenic.weatherapi;

public class WeatherData {
    private String weather;
    private String temperature;
    private String wind;
    private String humidity;
    private String visibility;
    private String uvIndex;
    private String airQuality;
    private String lastUpdate;
    private String city;

    public WeatherData(String weather, String temperature, String wind, String humidity, String visibility, String uvIndex, String airQuality, String lastUpdate) {
        this.weather = weather;
        this.temperature = temperature;
        this.wind = wind;
        this.humidity = humidity;
        this.visibility = visibility;
        this.uvIndex = uvIndex;
        this.airQuality = airQuality;
        this.lastUpdate = lastUpdate;
    }

    public WeatherData(String city, String aqi) {
        this.city = city;
        this.airQuality = aqi;
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

    public String getWind() {
        return wind;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getUvIndex() {
        return uvIndex;
    }

    public String getAirQuality() {
        return airQuality;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }
}
