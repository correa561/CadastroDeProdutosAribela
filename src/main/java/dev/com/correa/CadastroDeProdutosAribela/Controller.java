package dev.com.correa.CadastroDeProdutosAribela;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/inicio")
    String inicioDoSite (){
        return "Bem vindo ao site caralho";
    }

    @GetMapping("/inicio/do/site/2")
    String inicioDoSite2(){
        return"Oi";
    }


}

