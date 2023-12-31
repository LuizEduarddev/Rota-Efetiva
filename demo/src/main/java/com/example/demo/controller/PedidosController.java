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
import com.example.demo.Pedidos.Pedidos;
import com.example.demo.Pedidos.PedidosService;

@RestController
@RequestMapping("/pedidos")
public class PedidosController 
{

    @Autowired
    private PedidosService service;

    @GetMapping
    public List<Pedidos> buscarTodos()
    {
        return service.getAllList();
    }

    @PostMapping
    public Pedidos inserir(Pedidos pedidos)
    {
        return service.insertDB(pedidos);
    }

    @PutMapping
    public Pedidos alterar(Pedidos pedidos)
    {
        return service.alterDB(pedidos);
    }

    @DeleteMapping
    public ResponseEntity<Void> excluir(Long id)
    {
        service.excludeDB(id);
        return ResponseEntity.ok().build();
    }
}
