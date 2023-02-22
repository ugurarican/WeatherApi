package com.ugurarican.weatherapi.converter;

import com.ugurarican.weatherapi.dto.WeatherDto;
import com.ugurarican.weatherapi.model.Weather;
import org.springframework.stereotype.Component;

@Component
public class WeatherConverter {

    public WeatherDto toDto(Weather weather) {
        return new WeatherDto(
                weather.getDatetime(),
                weather.getTemp(),
                weather.getFeelslike(),
                weather.getTempmin(),
                weather.getTempmax(),
                weather.getConditions(),
                weather.getDescription()
        );
    }

}
