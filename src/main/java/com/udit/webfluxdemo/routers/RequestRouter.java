package com.udit.webfluxdemo.routers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import com.udit.webfluxdemo.components.RequestHandler;

@Configuration
public class RequestRouter {

	@Bean
	public RouterFunction<?> routes(RequestHandler handler) {
//		RouterFunction<?> route = route(GET("/person/{id}"),
//		  request -> {
//		    Mono<Person> person = Mono.justOrEmpty(request.pathVariable("id"))
//		      .map(Integer::valueOf)
//		      .then(repository::getPerson);
//		    return Response.ok().body(fromPublisher(person, Person.class));
//		  })
//		  .and(route(GET("/person"),
//		    request -> {
//		      Flux<Person> people = repository.allPeople();
//		      return Response.ok().body(fromPublisher(people, Person.class));
//		    }))
//		  .and(route(POST("/person"),
//		    request -> {
//		      Mono<Person> person = request.body(toMono(Person.class));
//		      return Response.ok().build(repository.savePerson(person));
//		    }));
//		return route;
		return RouterFunctions.route(RequestPredicates.GET("/weather"), handler::streamWeather);
	}
}
