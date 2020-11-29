package com.udit.webfluxdemo.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.udit.webfluxdemo.models.WeatherEvent;
import com.udit.webfluxdemo.services.WeatherService;

import reactor.core.publisher.Mono;

@Component
public class RequestHandler {

	@Autowired
	private WeatherService service;
	
	public Mono<ServerResponse> streamWeather(ServerRequest request) {
		return ServerResponse.ok().contentType(MediaType.TEXT_EVENT_STREAM).body(service.streamWeather(), WeatherEvent.class);
	}
}
