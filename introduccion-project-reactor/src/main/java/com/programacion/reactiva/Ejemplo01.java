package com.programacion.reactiva;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo01 {
    public static void main(String[] args) {

        List<Integer> elementosFromMono = new ArrayList<>();

        List<Integer> elementosFromFlux = new ArrayList<>();

        //crear mono
        Mono<Integer> mono = Mono.just(121);

        // crear flux
        Flux<Integer> flux = Flux.just(12,15,23,44,58,8,6,7);

        // subscritirnos a mono

        mono.subscribe(elementosFromMono::add);

        // subscritirnos a flux
        flux.subscribe(elementosFromFlux::add);

        System.out.println(elementosFromMono);
        System.out.println(elementosFromFlux);
    }
}
