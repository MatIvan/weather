package ru.mativ.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AstroDto {
    private String sunrise;// "07:04 AM"
    private String sunset;// "06:34 PM"
    private String moonrise;// "08:09 PM"
    private String moonset;// "12:32 PM"

    @JsonProperty("moon_phase")
    private String moonPhase;// "Waning Gibbous"

    @JsonProperty("moon_illumination")
    private String moonIllumination;// "84"

    @JsonProperty("is_moon_up")
    private Integer isMoonUp;// 1

    @JsonProperty("is_sun_up")
    private Integer isSunUp;// 0

    public AstroDto() {
        super();
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getMoonrise() {
        return moonrise;
    }

    public void setMoonrise(String moonrise) {
        this.moonrise = moonrise;
    }

    public String getMoonset() {
        return moonset;
    }

    public void setMoonset(String moonset) {
        this.moonset = moonset;
    }

    public String getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(String moonPhase) {
        this.moonPhase = moonPhase;
    }

    public String getMoonIllumination() {
        return moonIllumination;
    }

    public void setMoonIllumination(String moonIllumination) {
        this.moonIllumination = moonIllumination;
    }

    public Integer getIsMoonUp() {
        return isMoonUp;
    }

    public void setIsMoonUp(Integer isMoonUp) {
        this.isMoonUp = isMoonUp;
    }

    public Integer getIsSunUp() {
        return isSunUp;
    }

    public void setIsSunUp(Integer isSunUp) {
        this.isSunUp = isSunUp;
    }

    @Override
    public String toString() {
        return "AstroDto [sunrise=" + sunrise + ", sunset=" + sunset + ", moonrise=" + moonrise + ", moonset=" + moonset + ", moonPhase=" + moonPhase
                + ", moonIllumination=" + moonIllumination + ", isMoonUp=" + isMoonUp + ", isSunUp=" + isSunUp + "]";
    }

}
