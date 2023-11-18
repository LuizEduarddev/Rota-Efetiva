package com.example.demo.Produtos;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class ProdutosService 
{
    @Autowired
    private ProdutosRepository repository;
    
    public List<Produtos> getAllList()
    {
        return repository.findAll();
    }

    public Produtos insertDB(Produtos produto)
    {
        Produtos produtoNovo = repository.saveAndFlush(produto);
        return produtoNovo;
    }

    public Produtos alterDB(Produtos produto)
    {
        return repository.saveAndFlush(produto);
    }

    public void excludeDB(Long id)
    {
        Produtos produtoID = repository.findById(id).get();
        repository.delete(produtoID);
    }
}
