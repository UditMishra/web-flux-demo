package com.udit.webfluxdemo.services;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.udit.webfluxdemo.models.Weather;
import com.udit.webfluxdemo.models.WeatherEvent;

import reactor.core.publisher.Flux;

@Service
public class WeatherService {

	public Flux<WeatherEvent> streamWeather() {
		Flux<Long> interval = Flux.interval(Duration.ofSeconds(1));
		Flux<WeatherEvent> events = Flux.
										fromStream(Stream.generate(
												()->new WeatherEvent(new Weather("27C","100 km/h","40%"), LocalDateTime.now())));
		return Flux.zip(events, interval, (key, value) -> key);
	}
}
