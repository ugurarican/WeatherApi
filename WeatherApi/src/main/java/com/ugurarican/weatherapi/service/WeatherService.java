package com.ugurarican.weatherapi.service;

import com.ugurarican.weatherapi.dto.WeatherForecastDto;


public interface WeatherService {

    WeatherForecastDto getDailyWeatherForecast(String address);

    WeatherForecastDto getWeeklyWeatherForecast(String address);

    WeatherForecastDto getMonthlyWeatherForecast(String address);


}
