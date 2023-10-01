package ru.mativ.weather.external;

public class WeatherServiceException extends Exception {
    private static final long serialVersionUID = -2052616968041931938L;

    public WeatherServiceException(String message) {
        super(message);
    }

    public WeatherServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
