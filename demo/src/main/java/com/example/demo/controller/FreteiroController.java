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

import com.example.demo.Freteiro.FreteiroService;
import com.example.demo.Freteiro.Freteiro;

@RestController
@RequestMapping("/freteiro")
public class FreteiroController 
{

    @Autowired
    private FreteiroService service;

    @GetMapping
    public List<Freteiro> buscarTodos()
    {
        return service.getAllList();
    }

    @PostMapping
    public Freteiro inserir(Freteiro freteiro)
    {
        return service.insertDB(freteiro);
    }

    @PutMapping
    public Freteiro alterar(Freteiro freteiro)
    {
        return service.alterDB(freteiro);
    }

    @DeleteMapping
    public ResponseEntity<Void> excluir(Long id)
    {
        service.excludeDB(id);
        return ResponseEntity.ok().build();
    }
}
