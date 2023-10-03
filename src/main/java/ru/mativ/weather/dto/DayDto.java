package ru.mativ.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayDto {
    @JsonProperty("maxtemp_c")
    private Float maxTemp;

    @JsonProperty("mintemp_c")
    private Float minTemp;

    @JsonProperty("avgtemp_c")
    private Float avgTemp;

    @JsonProperty("maxwind_kph")
    private Float maxWind;

    @JsonProperty("totalprecip_mm")
    private Float totalPrecip;

    @JsonProperty("totalsnow_cm")
    private Float totalSnow;

    @JsonProperty("avghumidity")
    private Float avgHumidity;

    @JsonProperty("daily_chance_of_rain")
    private Float dailyChanceOfRain;

    @JsonProperty("daily_chance_of_snow")
    private Float dailyChanceOfSnow;

    private ConditionDto condition;

    public DayDto() {
        super();
    }

    public Float getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Float maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Float getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Float minTemp) {
        this.minTemp = minTemp;
    }

    public Float getAvgTemp() {
        return avgTemp;
    }

    public void setAvgTemp(Float avgTemp) {
        this.avgTemp = avgTemp;
    }

    public Float getMaxWind() {
        return maxWind;
    }

    public void setMaxWind(Float maxWind) {
        this.maxWind = maxWind;
    }

    public Float getTotalPrecip() {
        return totalPrecip;
    }

    public void setTotalPrecip(Float totalPrecip) {
        this.totalPrecip = totalPrecip;
    }

    public Float getTotalSnow() {
        return totalSnow;
    }

    public void setTotalSnow(Float totalSnow) {
        this.totalSnow = totalSnow;
    }

    public Float getAvgHumidity() {
        return avgHumidity;
    }

    public void setAvgHumidity(Float avgHumidity) {
        this.avgHumidity = avgHumidity;
    }

    public Float getDailyChanceOfRain() {
        return dailyChanceOfRain;
    }

    public void setDailyChanceOfRain(Float dailyChanceOfRain) {
        this.dailyChanceOfRain = dailyChanceOfRain;
    }

    public Float getDailyChanceOfSnow() {
        return dailyChanceOfSnow;
    }

    public void setDailyChanceOfSnow(Float dailyChanceOfSnow) {
        this.dailyChanceOfSnow = dailyChanceOfSnow;
    }

    public ConditionDto getCondition() {
        return condition;
    }

    public void setCondition(ConditionDto condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "DayDto [maxTemp=" + maxTemp + ", minTemp=" + minTemp + ", avgTemp=" + avgTemp + ", maxWind=" + maxWind + ", totalPrecip=" + totalPrecip
                + ", totalSnow=" + totalSnow + ", avgHumidity=" + avgHumidity + ", dailyChanceOfRain=" + dailyChanceOfRain + ", dailyChanceOfSnow="
                + dailyChanceOfSnow + ", condition=" + condition + "]";
    }

}
