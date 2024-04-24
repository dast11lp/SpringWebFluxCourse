package com.programacion.reactiva;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Ejemplo01 {
    public static void main(String[] args) {

        // flujo de datos se para luego del 10, y en vez de
        // imprimir el error por el log, retorna
        // el 72 en lugar del error y para
        Flux.just(2,7,10)
                .concatWith(Flux.error(new RuntimeException("Exception ocurred")))
                .concatWith(Mono.just(12))
                .onErrorReturn(72)
                .log()
                .subscribe();
    }
}
