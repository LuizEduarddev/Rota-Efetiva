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
import com.example.demo.Endereco.Endereco;
import com.example.demo.Endereco.EnderecoService;

@RestController
@RequestMapping("/endereco")
public class EnderecoController 
{

    @Autowired
    private EnderecoService service;

    @GetMapping
    public List<Endereco> buscarTodos()
    {
        return service.getAllList();
    }

    @PostMapping
    public Endereco inserir(Endereco endereco)
    {
        return service.insertDB(endereco);
    }

    @PutMapping
    public Endereco alterar(Endereco endereco)
    {
        return service.alterDB(endereco);
    }

    @DeleteMapping
    public ResponseEntity<Void> excluir(Long id)
    {
        service.excludeDB(id);
        return ResponseEntity.ok().build();
    }
}
