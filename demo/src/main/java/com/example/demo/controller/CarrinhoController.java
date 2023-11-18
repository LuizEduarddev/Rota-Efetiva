package com.example.demo.controller;

import java.util.List;

import com.example.demo.Carrinho.CarrinhoService;
import com.example.demo.Carrinho.Carrinho;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/carrinho")
public class CarrinhoController 
{

    @Autowired
    private CarrinhoService service;

    @GetMapping
    public List<Carrinho> buscarTodos()
    {
        return service.searchDB();
    }

    @PostMapping
    public Carrinho inserir(Carrinho carrinho)
    {
        return service.insertDB(carrinho);
    }

    @PutMapping
    public Carrinho alterar(Carrinho carrinho)
    {
        return service.alterDB(carrinho);
    }

    @DeleteMapping
    public ResponseEntity<Void> excluir(Long id)
    {
        service.excludeDB(id);
        return ResponseEntity.ok().build();
    }
}
