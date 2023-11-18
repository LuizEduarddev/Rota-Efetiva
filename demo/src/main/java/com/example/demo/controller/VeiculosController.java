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

import com.example.demo.Veiculos.VeiculoService;
import com.example.demo.Veiculos.Veiculo;

@RestController
@RequestMapping("/veiculos")
public class VeiculosController 
{

    @Autowired
    private VeiculoService service;

    @GetMapping
    public List<Veiculo> buscarTodos()
    {
        return service.getAllList();
    }

    @PostMapping
    public Veiculo inserir(Veiculo veiculo)
    {
        return service.insertDB(veiculo);
    }

    @PutMapping
    public Veiculo alterar(Veiculo veiculo)
    {
        return service.alterDB(veiculo);
    }

    @DeleteMapping
    public ResponseEntity<Void> excluir(Long id)
    {
        service.excludeDB(id);
        return ResponseEntity.ok().build();
    }
}
