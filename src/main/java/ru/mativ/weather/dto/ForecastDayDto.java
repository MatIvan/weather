package ru.mativ.weather.dto;

import java.util.List;

public class ForecastDayDto {
    private String date;//"YYYY-MM-DD"
    private DayDto day;
    private AstroDto astro;
    private List<HourDto> hour;

    public ForecastDayDto() {
        super();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public DayDto getDay() {
        return day;
    }

    public void setDay(DayDto day) {
        this.day = day;
    }

    public AstroDto getAstro() {
        return astro;
    }

    public void setAstro(AstroDto astro) {
        this.astro = astro;
    }

    public List<HourDto> getHour() {
        return hour;
    }

    public void setHour(List<HourDto> hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "ForecastDayDto [date=" + date + ", day=" + day + ", astro=" + astro + ", hour=" + hour + "]";
    }

}
