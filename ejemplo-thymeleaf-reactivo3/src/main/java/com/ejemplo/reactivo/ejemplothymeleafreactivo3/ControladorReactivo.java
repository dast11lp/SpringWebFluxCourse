package com.ejemplo.reactivo.ejemplothymeleafreactivo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring6.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring6.context.webflux.ReactiveDataDriverContextVariable;

@Controller
public class ControladorReactivo {

    @Autowired
    private ProductoService productoService;

    @RequestMapping("/")
    public String listarProductos (Model model) {
        //variable reactiva
        IReactiveDataDriverContextVariable listaReactiva =
                new ReactiveDataDriverContextVariable(this.productoService.buscarTodos());
        model.addAttribute("listaProductos", listaReactiva);
        return "lista";
    }
}
