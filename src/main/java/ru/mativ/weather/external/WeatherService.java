package ru.mativ.weather.external;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriBuilder;

import ru.mativ.weather.dto.WeatherDto;

@Service
public class WeatherService {
    private static final Logger LOG = LoggerFactory.getLogger(WeatherService.class);

    private static final String API_PARAM_VALUE_RU = "ru";
    private static final String API_PARAM_VALUE_NO = "no";
    private static final String API_PARAM_LANG = "lang";
    private static final String API_PARAM_ALERTS = "alerts";
    private static final String API_PARAM_AIR_QUALITY = "aqi";
    private static final String API_PARAM_LOCATION = "q";
    private static final String API_PARAM_KEY = "key";
    private static final String API_PARAM_DAYS = "days";
    private static final String REQUEST_API_ERROR = "Request api error.";
    private static final String RESPONSE_IS_EMPTY = "Response is empty.";
    private static final String URI_GENERATION_ERROR = "Uri generation error.";

    @Value("${api.url.current}")
    String apiUrlCurrent;

    @Value("${api.url.forecast}")
    String apiUrlForecast;

    @Value("${api.secret}")
    String apiSecret;

    RestTemplate rest = new RestTemplate();

    private ResponseEntity<WeatherDto> send(URI uri) throws WeatherServiceException {
        ResponseEntity<WeatherDto> resp = rest.getForEntity(uri, WeatherDto.class);
        if (!resp.getStatusCode().is2xxSuccessful()) {
            throw new WeatherServiceException(REQUEST_API_ERROR);
        }
        if (!resp.hasBody()) {
            throw new WeatherServiceException(RESPONSE_IS_EMPTY);
        }
        return resp;
    }

    private URI getUri(String baseUrl, String location, Integer days) throws WeatherServiceException {
        try {
            UriBuilder uri = new DefaultUriBuilderFactory(baseUrl)
                    .builder()
                    .queryParam(API_PARAM_KEY, apiSecret)
                    .queryParam(API_PARAM_LOCATION, location)
                    .queryParam(API_PARAM_AIR_QUALITY, API_PARAM_VALUE_NO)
                    .queryParam(API_PARAM_ALERTS, API_PARAM_VALUE_NO)
                    .queryParam(API_PARAM_LANG, API_PARAM_VALUE_RU);
            if (days != null && days > 0) {
                uri.queryParam(API_PARAM_DAYS, days);
            }
            return uri.build();
        } catch (Exception e) {
            LOG.error(URI_GENERATION_ERROR, e);
            throw new WeatherServiceException(URI_GENERATION_ERROR, e);
        }
    }

    public WeatherDto current(String location) throws WeatherServiceException {
        URI uri = getUri(apiUrlCurrent, location, null);
        LOG.info(uri.toString());
        return send(uri).getBody();
    }

    public WeatherDto forecast(String location, Integer days) throws WeatherServiceException {
        URI uri = getUri(apiUrlForecast, location, days);
        LOG.info(uri.toString());
        return send(uri).getBody();
    }

}
