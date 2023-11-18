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

import com.example.demo.Empresas.Empresas;
import com.example.demo.Empresas.EmpresasService;

@RestController
@RequestMapping("/empresas")
public class EmpresasController 
{

    @Autowired
    private EmpresasService service;

    @GetMapping
    public List<Empresas> buscarTodos()
    {
        return service.searchDB();
    }

    @PostMapping
    public Empresas inserir(Empresas empresa)
    {
        return service.insertDB(empresa);
    }

    @PutMapping
    public Empresas alterar(Empresas empresa)
    {
        return service.alterDB(empresa);
    }

    @DeleteMapping
    public ResponseEntity<Void> excluir(Long id)
    {
        service.excludeDB(id);
        return ResponseEntity.ok().build();
    }
}
