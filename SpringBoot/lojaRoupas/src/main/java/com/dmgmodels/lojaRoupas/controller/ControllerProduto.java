package com.dmgmodels.lojaRoupas.controller;

import com.dmgmodels.lojaRoupas.model.DadosCadastroRoupa;
import com.dmgmodels.lojaRoupas.model.Roupa;
import com.dmgmodels.lojaRoupas.repository.RoupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Quando classifica uma APIRest, onde todos os métodos retornam dados
@RequestMapping("/roupa")//serve para mapear requisições HTTP para métodos específicos em controladores(Servidor que está rodando o java)

public class ControllerProduto {

    @Autowired
    private RoupaRepository roupaRepository; //Possui todos os métodos de Save, find e delete

    @PostMapping
    public void cadastrarProduto(@RequestBody DadosCadastroRoupa dados){
        roupaRepository.save(new Roupa(dados));
    }

    @GetMapping
    public List<Roupa> listarProdutos(){  //Metodo de Getting
        return roupaRepository.findAll();
    }

}
