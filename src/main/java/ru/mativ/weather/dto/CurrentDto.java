package ru.mativ.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentDto {

    @JsonProperty("temp_c")
    private Float temp; //Temperature in celsius

    @JsonProperty("wind_kph")
    private Float windSpeed;//Wind speed in kilometer per hour

    @JsonProperty("wind_dir")
    private String windDirrection;//Wind direction as 16 point compass. e.g.: NSW

    @JsonProperty("precip_mm")
    private Float precipMm;//Precipitation amount in millimeters

    @JsonProperty("humidity")
    private Integer humidity; //Humidity as percentage

    @JsonProperty("cloud")
    private Integer cloud; //Cloud cover as percentage

    @JsonProperty("condition")
    private ConditionDto condition;

    public CurrentDto() {
        super();
    }

    public Float getTemp() {
        return temp;
    }

    public void setTemp(Float temp) {
        this.temp = temp;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirrection() {
        return windDirrection;
    }

    public void setWindDirrection(String windDirrection) {
        this.windDirrection = windDirrection;
    }

    public Float getPrecipMm() {
        return precipMm;
    }

    public void setPrecipMm(Float precipMm) {
        this.precipMm = precipMm;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getCloud() {
        return cloud;
    }

    public void setCloud(Integer cloud) {
        this.cloud = cloud;
    }

    public ConditionDto getCondition() {
        return condition;
    }

    public void setCondition(ConditionDto condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "CurrentDto [temp=" + temp + ", windSpeed=" + windSpeed + ", windDirrection=" + windDirrection + ", precipMm=" + precipMm + ", humidity="
                + humidity + ", cloud=" + cloud + ", condition=" + condition + "]";
    }

}
