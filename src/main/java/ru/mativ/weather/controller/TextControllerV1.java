package ru.mativ.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.mativ.weather.external.WeatherServiceException;
import ru.mativ.weather.service.TextService;

@RestController
@RequestMapping(value = "/v1/text")
public class TextControllerV1 {

    @Autowired
    TextService textService;

    @GetMapping("/now")
    public String now(String location) throws WeatherServiceException {
        return textService.now(location);
    }

    @GetMapping("/day")
    public String day(String location) {
        //TODO
        return null;
    }

}
