package com.example.ac1pt2.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.ac1pt2.dtos.DadosProdutoDTO;
import com.example.ac1pt2.dtos.DTO_produto;
import com.example.ac1pt2.models.Produto;
import com.example.ac1pt2.services.servico_produto;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

@RequestMapping("/api/produto")
public class Controle_produto {

    private servico_produto servico_produto;

    public ProdutoController(servico_produto servico_produto){
        this.servico_produto = servico_produto;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto salvar(@RequestBody ProdutoDTO produtoDTO){
        return servico_produto.salvar(produtoDTO);
        
    }

    @GetMapping
    public List<ProdutoDTO> getProdutos(){
        return servico_produto.obterTodos();
    }

    @GetMapping("{id}")
    public ProdutoDTO obterProdutoPorId(@PathVariable Long id) {
        return servico_produto.obterPorId(id);
    }

     

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id){
        servico_produto.remover(id);
    }

    @PutMapping("{id}")
    public void editProduto(@PathVariable Long id, @RequestBody ProdutoDTO dto){
        servico_produto.editar(id, dto);
    }
    
    
}
