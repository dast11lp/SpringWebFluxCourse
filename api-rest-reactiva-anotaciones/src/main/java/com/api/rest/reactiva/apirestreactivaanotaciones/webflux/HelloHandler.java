package com.api.rest.reactiva.apirestreactivaanotaciones.webflux;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class HelloHandler {
    public Mono<ServerResponse> mostrarMensajeMono
            (ServerRequest request) {
            return ServerResponse.ok()
                    .contentType(MediaType.TEXT_PLAIN)
                    .body(
                            Mono.just("Bienvenido a mi página"),
                            String.class
                    );
    }

    public Mono<ServerResponse> mostrarMensajeFlux
            (ServerRequest request) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_NDJSON)
                .body(
                        Flux.just("Bienvenido", "a", "mi", "pagina"),
                        String.class
                );
    }
}
