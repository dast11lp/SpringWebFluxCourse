package com.api.rest.reactiva.apirestreactivaanotaciones.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/mono")
    public Mono<String> getMono () {
        return Mono.just("Bienvenidos");
    }

    @GetMapping(path = "flux", produces = MediaType.APPLICATION_NDJSON_VALUE)
    public Flux<String> getFlux() {
        Flux<String> mensaje =
                Flux.just("Bienvenido", "a", "mi", "pagina")
                        .delayElements(Duration.ofSeconds(1));

        return mensaje;
    }
}
