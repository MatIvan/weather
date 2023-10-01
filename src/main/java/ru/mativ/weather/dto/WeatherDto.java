package ru.mativ.weather.dto;

public class WeatherDto {
    private LocationDto location;
    private CurrentDto current;

    public LocationDto getLocation() {
        return location;
    }

    public void setLocation(LocationDto location) {
        this.location = location;
    }

    public CurrentDto getCurrent() {
        return current;
    }

    public void setCurrent(CurrentDto current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "WeatherDto [location=" + location + ", current=" + current + "]";
    }

}
