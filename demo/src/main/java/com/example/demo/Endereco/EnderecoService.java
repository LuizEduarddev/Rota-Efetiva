package com.example.demo.Endereco;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class EnderecoService 
{
    @Autowired
    private EnderecoRepository repository;
    
    public List<Endereco> getAllList()
    {
        return repository.findAll();
    }

    public Endereco insertDB(Endereco endereco)
    {
        Endereco enderecoNovo = repository.saveAndFlush(endereco);
        return enderecoNovo;
    }

    public Endereco alterDB(Endereco endereco)
    {
        return repository.saveAndFlush(endereco);
    }

    public void excludeDB(Long id)
    {
        Endereco enderecoID = repository.findById(id).get();
        repository.delete(enderecoID);
    }
}
