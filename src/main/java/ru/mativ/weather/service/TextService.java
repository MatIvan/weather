package ru.mativ.weather.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.mativ.weather.Messages;
import ru.mativ.weather.dto.WeatherDto;
import ru.mativ.weather.external.WeatherService;
import ru.mativ.weather.external.WeatherServiceException;

@Service
public class TextService {
    private static final Logger LOG = LoggerFactory.getLogger(TextService.class);

    @Autowired
    WeatherService weather;

    @Autowired
    Messages messages;

    public String now(String location) throws WeatherServiceException {
        WeatherDto cur = weather.current(location);
        LOG.info(cur.toString());
        return getPrefix(cur)
                + getTemperature(cur)
                + getWind(cur);
    }

    private String getPrefix(WeatherDto weather) {
        String sity = messages.sity(weather.getLocation().getName());
        String state = weather.getCurrent().getCondition().getText().toLowerCase();
        return messages.weatherPrefix(sity, state);
    }

    private String getTemperature(WeatherDto weather) {
        Float temp = weather.getCurrent().getTemp();
        return messages.weatherTemperature(temp < 0 ? '-' : '+', temp);
    }

    private String getWind(WeatherDto weather) {
        Float speed = weather.getCurrent().getWindSpeed();
        Wind wind = Wind.getBySpeed(speed);
        return messages.weatherWind(wind.name());
    }

}
