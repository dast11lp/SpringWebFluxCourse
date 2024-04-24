package com.programacion.reactiva;

import reactor.core.publisher.Flux;

public class Ejemplo06 {
    public static void main(String[] args) {
        Flux<String> flux1 = Flux.just("A","B","C");
        Flux<String> flux2 = Flux.just("D","E","F");

        // imprimirá 3 lineas ya que toma cada flujo como uno
        Flux.zip(flux1, flux2, (first, second) -> first + second)
                .subscribe(System.out::println);
    }
}
