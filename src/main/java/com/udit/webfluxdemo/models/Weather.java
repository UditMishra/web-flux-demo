package com.udit.webfluxdemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Weather {

	private String temperature;
	private String windSpeed;
	private String humidity;
}
