package com.dmgmodels.lojaRoupas.controller;

import com.dmgmodels.lojaRoupas.model.DadosCadastroRoupa;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Quando classifica uma APIRest, onde todos os métodos retornam dados
@RequestMapping("/roupa")//serve para mapear requisições HTTP para métodos específicos em controladores

public class ControllerProduto {

    @PostMapping
    public void cadastrarProduto(@RequestBody DadosCadastroRoupa dados){
        System.out.println(dados);
    }
}
