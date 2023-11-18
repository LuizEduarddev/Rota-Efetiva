package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Produtos.Produtos;
import com.example.demo.Produtos.ProdutosService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/produtos")
public class ProdutosController 
{
    
    @Autowired
    private ProdutosService service;

    @GetMapping
    public List<Produtos> buscar(Produtos produto)
    {
        return service.getAllList();
    }

    @PostMapping
    public Produtos inserir(Produtos produto)
    {
        return service.insertDB(produto);
    }

    @PutMapping
    public Produtos alterar(Produtos produto)
    {
        return service.alterDB(produto);
    }

    @DeleteMapping("/delete/{id}")
    public void deletar(@PathParam("id") Long id)
    {
        service.excludeDB(id);
    }
}
