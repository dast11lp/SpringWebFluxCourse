package com.programacion.reactiva;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejemplo02 {
    public static void main(String[] args) {
        // creamos un flujo de 100 elementos
        Flux<Integer> flux = Flux.range(1, 100).log();

        // nos suscribimos
        flux.subscribe(new BaseSubscriber<Integer>() {
            // suscritos con un limite, traera hasta el elemento numero 10
            @Override
            protected void hookOnSubscribe(Subscription subscription) {
                request(10);
            }

            // cancelamos el flujo hasta que su valor concida
            // con cierta lógica
            @Override
            protected void hookOnNext(Integer value) {
                if(value == 5)
                    cancel();
            }
        });
    }
}
