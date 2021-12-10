package com.arsenic.weatherapi.helpers;


public class GetAllData {
    public String city;
    public String aqi;
    public String weather;
    public String temperature;
    public MoreInfo details;
    public String lastUpdate;

    public GetAllData(String city, String temperature, String aqi, String weather, String lastUpdate, MoreInfo moreInfo) {
        this.city = city;
        this.aqi = aqi;
        this.weather = weather;
        this.details = moreInfo;
        this.temperature = temperature;
        this.lastUpdate = lastUpdate;
    }

}