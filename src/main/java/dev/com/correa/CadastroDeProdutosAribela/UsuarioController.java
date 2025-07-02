package dev.com.correa.CadastroDeProdutosAribela;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UsuarioController {

    @GetMapping("/logar")
    String inicioDoSite (){
        return "Bem vindo ao site caralho";
    }


}

