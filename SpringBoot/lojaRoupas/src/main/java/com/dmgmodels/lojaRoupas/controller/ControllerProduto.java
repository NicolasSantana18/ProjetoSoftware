package com.dmgmodels.lojaRoupas.controller;

import com.dmgmodels.lojaRoupas.dto.DadosAtualizarRoupa;
import com.dmgmodels.lojaRoupas.dto.DadosCadastroRoupa;
import com.dmgmodels.lojaRoupas.model.Roupa;
import com.dmgmodels.lojaRoupas.repository.RoupaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins =  "*")
@RestController //Quando classifica uma APIRest, onde todos os métodos retornam dados
@RequestMapping("/roupa")//serve para mapear requisições HTTP para métodos específicos em controladores(Servidor que está rodando o java)

public class ControllerProduto {

    @Autowired
    private RoupaRepository roupaRepository; //Possui todos os métodos de Save, find e delete

    @PostMapping
    @Transactional
    public void cadastrarProduto(@RequestBody DadosCadastroRoupa dados){
        roupaRepository.save(new Roupa(dados));
    }

    @GetMapping
    public List<Roupa> listarProdutos(){  //Metodo de Getting
        return roupaRepository.findAll();
    }


    //Listando os produtos por condição
    @GetMapping("/nomeProduto/{nomeProduto}")
    public List<Roupa> listarProdutosPorNome(@PathVariable String nomeProduto){
        return roupaRepository.findByNomeProduto(nomeProduto);
    }

    //Fazendo o método DELETE
    @DeleteMapping("/{id}")
    @Transactional
    public void deleteProduto(@PathVariable Long id){
        roupaRepository.deleteById(id);
    }

    //Fazendo o método PUT
    @PutMapping
    @Transactional
    public void atualizarProduto (@RequestBody DadosAtualizarRoupa novosDados){
        var roupa = roupaRepository.getReferenceById(novosDados.id());
        roupa.atualizarRoupa(novosDados);
        System.out.println(roupa.toString());
    }

}
