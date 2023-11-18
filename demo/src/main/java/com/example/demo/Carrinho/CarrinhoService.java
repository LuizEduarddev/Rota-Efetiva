package com.example.demo.Carrinho;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrinhoService 
{
    
    @Autowired
    private CarrinhoRepository repository;

    public List<Carrinho> searchDB()
    {
        return repository.findAll();
    }

    public Carrinho insertDB(Carrinho carrinho)
    {
        Carrinho carrinhoNovo = repository.saveAndFlush(carrinho);
        return carrinhoNovo;
    }

    public Carrinho alterDB(Carrinho carrinho)
    {
        return repository.saveAndFlush(carrinho);
    }

    public void excludeDB(Long id)
    {
        Carrinho carrinho = repository.findById(id).get();
        repository.delete(carrinho);
    }

}
