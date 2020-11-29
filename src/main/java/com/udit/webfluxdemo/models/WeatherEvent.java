package com.udit.webfluxdemo.models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class WeatherEvent {

	private Weather weather;
	private LocalDateTime date;
}
