package com.programacion.reactiva;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejemplo01 {
    public static void main(String[] args) {
        // creamos un flujo con un par de elementos
        Flux<String> ciudades = Flux.fromIterable(
                new ArrayList<>(Arrays.asList(
                        "New York",
                        "London",
                        "Paris",
                        "Toronto",
                        "Rome"))
                );
        // creamos un log por elemento del flujo
        // nos suscribimos sin un limite (operamos con todos los elementos)
        ciudades.log().subscribe();
    }
}
