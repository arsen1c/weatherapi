package com.arsenic.weatherapi.services;

import com.arsenic.weatherapi.helpers.GetAllData;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


public class WeatherScraper {
    public GetAllData getData() {
        try{
            Document doc = Jsoup.connect("https://weather.com/en-IN/weather/today/l/08392d59bb5eee08fea7670b4ea1afd73575bed474fffb362c4795c94ce4761d").get();

            String city =  doc.select(".CurrentConditions--location--kyTeL").text();
            String aqi = doc.select("text[data-testid=\"DonutChartValue\"]").text();

            System.out.println("AQI: " + aqi);

            return new GetAllData(city, aqi);
        }catch(IOException e) {
            e.printStackTrace();
            return new GetAllData(null, null);
//            return "404 City not found";
//             throw new Exception("Couldnt get weather of that city");
        }
    }
}
