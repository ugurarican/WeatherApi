package com.ugurarican.weatherapi.converter;

import com.ugurarican.weatherapi.dto.WeatherDto;
import com.ugurarican.weatherapi.dto.WeatherForecastDto;
import com.ugurarican.weatherapi.model.WeatherForecast;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class WeatherForecastConverter {

    private final WeatherConverter weatherConverter;

    public WeatherForecastDto toDto(WeatherForecast forecast) {

        List<WeatherDto> weatherDTOs = new ArrayList<>();

        forecast.getDays().forEach(weather ->
                weatherDTOs.add(weatherConverter.toDto(weather))
        );


        return new WeatherForecastDto(forecast.getAddress(), weatherDTOs);
    }
}
