package com.arsenic.weatherapi.services;

import com.arsenic.weatherapi.helpers.GetAllData;
import com.arsenic.weatherapi.helpers.MoreInfo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;

@Component
public class WeatherScraper {
    @Value("${MAPBOX_KEY}")
    String MAPBOX_KEY;

    public String getMAPBOX_KEY() {
        return MAPBOX_KEY;
    }

    public GetAllData getData() {
        try{
            Document doc = Jsoup.connect("https://weather.com/en-IN/weather/today/l/08392d59bb5eee08fea7670b4ea1afd73575bed474fffb362c4795c94ce4761d").get();

            String city =  doc.select(".CurrentConditions--location--kyTeL").text();
            String aqi = doc.select("text[data-testid=\"DonutChartValue\"]").text();
            String weather = doc.select(".CurrentConditions--phraseValue--2Z18W").text();
            String temperature = doc.select("span[data-testid=TemperatureValue]").text().split("°")[0];
            String[] lastUpateArrr = doc.select(".CurrentConditions--timestamp--23dfw").text().split("As of");
            String lastUpdate = String.join("", lastUpateArrr);

            HashMap<String, String> moreDetails = new HashMap<>();

            System.out.println("MAPBOX_KEY: " + System.getenv("MAPBOX_KEY"));

            // Elements is a type of ArrayLists
            Elements detailsLabels = doc.select(".WeatherDetailsListItem--label--3PkXl");
            Elements detailsValues = doc.select(".WeatherDetailsListItem--wxData--2s6HT");

            // Add values from detailsLabels and detailsValues ArrayList in the details HashMap.
           for (int x = 0; x < detailsLabels.size(); x++) {
                moreDetails.put(detailsLabels.get(x).text(), detailsValues.get(x).text());
           }

            return new GetAllData(city, temperature, aqi, weather, lastUpdate , new MoreInfo(moreDetails));
        }catch(IOException e) {
            e.printStackTrace();
            return new GetAllData(null, null, null, null, null, null);
        }
    }
}
