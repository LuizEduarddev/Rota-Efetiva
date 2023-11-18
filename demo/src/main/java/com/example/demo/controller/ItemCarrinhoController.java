package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.ItemCarrinho.ItemCarrinho;
import com.example.demo.ItemCarrinho.ItemCarrinhoService;

@RestController
@RequestMapping("/itemCarrinho")
public class ItemCarrinhoController 
{

    @Autowired
    private ItemCarrinhoService service;

    @GetMapping
    public List<ItemCarrinho> buscarTodos()
    {
        return service.getAllList();
    }

    @PostMapping
    public ItemCarrinho inserir(ItemCarrinho item)
    {
        return service.insertDB(item);
    }

    @PutMapping
    public ItemCarrinho alterar(ItemCarrinho item)
    {
        return service.alterDB(item);
    }

    @DeleteMapping
    public ResponseEntity<Void> excluir(Long id)
    {
        service.excludeDB(id);
        return ResponseEntity.ok().build();
    }
}
