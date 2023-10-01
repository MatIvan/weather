package ru.mativ.weather.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.mativ.weather.dto.LocationDto;
import ru.mativ.weather.dto.WeatherDto;
import ru.mativ.weather.external.WeatherService;
import ru.mativ.weather.external.WeatherServiceException;

@Service
public class TextService {
    private static final Logger LOG = LoggerFactory.getLogger(TextService.class);

    @Autowired
    WeatherService weather;

    public String now(String location) throws WeatherServiceException {
        WeatherDto cur = weather.current(location);
        LOG.info(cur.toString());
        return getPrefix(cur)
                + getTemperature(cur)
                + getWind(cur);
    }

    private String getPrefix(WeatherDto weather) {
        return String.format(
                "Сейчас в %s %s. ",
                trLocation(weather.getLocation()),
                weather.getCurrent().getCondition().getText().toLowerCase());
    }

    private String getTemperature(WeatherDto weather) {
        Float temp = weather.getCurrent().getTemp();
        return String.format(
                "Температура %c%.1f. ",
                temp < 0 ? '-' : '+',
                temp);
    }

    private String getWind(WeatherDto weather) {
        Float wind = weather.getCurrent().getWindSpeed();
        return String.format(
                wind == 0 ? "Штиль." : "%s ветер. ",
                Wind.getName(wind));
    }

    private String trLocation(LocationDto location) {
        switch (location.getName()) {
            case "Voronezh": {
                return "Воронеже";
            }
        }
        return location.getName();
    }

    //temp=24.0, windSpeed=6.8, windDirrection=S, precipMm=0.0, humidity=36, cloud=0, 
    //condition=Condition [text=Солнечно, icon=//cdn.weatherapi.com/weather/64x64/day/113.png
}
