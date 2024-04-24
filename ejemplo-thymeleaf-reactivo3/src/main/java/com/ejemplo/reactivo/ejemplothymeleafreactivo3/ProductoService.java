package com.ejemplo.reactivo.ejemplothymeleafreactivo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public Flux<Producto> buscarTodos() {
        Flux<Producto> flux1 = this.productoRepository.buscarTodos();
        Flux<Producto> flux2 = this.productoRepository.buscarOtros();

        return Flux.merge(flux1, flux2);

    }
}
