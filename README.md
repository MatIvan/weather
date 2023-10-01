# Weather microservice

Based on service: <https://www.weatherapi.com/docs/>

## TEXT API 
Return simple string about: 
* GET /v1/text/now?location=Moskow - current weather.
* GET /v1/text/day?location=Moskow - day forecast.

### examlpe
```bash
curl "http://localhost:8080/v1/text/now?location=Moskow"
```

