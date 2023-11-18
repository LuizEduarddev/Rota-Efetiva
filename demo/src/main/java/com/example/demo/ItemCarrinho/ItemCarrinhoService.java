package com.example.demo.ItemCarrinho;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class ItemCarrinhoService
{
    @Autowired
    private ItemCarrinhoRepository repository;
    
    public List<ItemCarrinho> getAllList()
    {
        return repository.findAll();
    }

    public ItemCarrinho insertDB(ItemCarrinho item)
    {
        ItemCarrinho ItemCarrinhoNovo = repository.saveAndFlush(item);
        return ItemCarrinhoNovo;
    }

    public ItemCarrinho alterDB(ItemCarrinho item)
    {
        return repository.saveAndFlush(item);
    }

    public void excludeDB(Long id)
    {
        ItemCarrinho freteiroID = repository.findById(id).get();
        repository.delete(freteiroID);
    }
}
