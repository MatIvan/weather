package ru.mativ.weather.dto;

import java.util.List;

public class ForecastDto {
    private List<ForecastDayDto> forecastday;

    public ForecastDto() {
        super();
    }

    public List<ForecastDayDto> getForecastday() {
        return forecastday;
    }

    public void setForecastday(List<ForecastDayDto> forecastday) {
        this.forecastday = forecastday;
    }

    @Override
    public String toString() {
        return "ForecastDto [forecastday=" + forecastday + "]";
    }

}
