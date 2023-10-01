package ru.mativ.weather;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class Messages {
    private static final Locale RU = new Locale("ru");

    @Autowired
    MessageSource messages;

    public String sity(String key) {
        return messages.getMessage(key.toLowerCase(), null, key, RU);
    }

    public String weatherPrefix(String sity, String status) {
        return messages.getMessage("weatherPrefix", new Object[] { sity, status }, RU);
    }

    public String weatherTemperature(char c, Float temp) {
        return messages.getMessage("weatherTemperature", new Object[] { c, temp }, RU);
    }

    public String weatherWind(String windName) {
        return messages.getMessage("wind_" + windName, new Object[] { windName }, RU);
    }
}
