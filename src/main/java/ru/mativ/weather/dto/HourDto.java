package ru.mativ.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HourDto {
    private String time; // "YYYY-MM-DD hh:mm"

    @JsonProperty("is_day")
    private Integer isDay; // 0

    @JsonProperty("will_it_rain")
    private Integer willItRain; // 1

    @JsonProperty("chance_of_rain")
    private Float chanceOfRain; // 72

    @JsonProperty("will_it_snow")
    private Integer willItSnow; // 0

    @JsonProperty("chance_of_snow")
    private Float chanceOfSnow; // 0

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

    public HourDto() {
        super();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getIsDay() {
        return isDay;
    }

    public void setIsDay(Integer isDay) {
        this.isDay = isDay;
    }

    public Integer getWillItRain() {
        return willItRain;
    }

    public void setWillItRain(Integer willItRain) {
        this.willItRain = willItRain;
    }

    public Float getChanceOfRain() {
        return chanceOfRain;
    }

    public void setChanceOfRain(Float chanceOfRain) {
        this.chanceOfRain = chanceOfRain;
    }

    public Integer getWillItSnow() {
        return willItSnow;
    }

    public void setWillItSnow(Integer willItSnow) {
        this.willItSnow = willItSnow;
    }

    public Float getChanceOfSnow() {
        return chanceOfSnow;
    }

    public void setChanceOfSnow(Float chanceOfSnow) {
        this.chanceOfSnow = chanceOfSnow;
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
        return "HourDto [time=" + time + ", isDay=" + isDay + ", willItRain=" + willItRain + ", chanceOfRain=" + chanceOfRain + ", willItSnow=" + willItSnow
                + ", chanceOfSnow=" + chanceOfSnow + ", temp=" + temp + ", windSpeed=" + windSpeed + ", windDirrection=" + windDirrection + ", precipMm="
                + precipMm + ", humidity=" + humidity + ", cloud=" + cloud + ", condition=" + condition + "]";
    }

}
