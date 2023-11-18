package com.example.demo.Freteiro;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class FreteiroService 
{
    @Autowired
    private FreteiroRepository repository;
    
    public List<Freteiro> getAllList()
    {
        return repository.findAll();
    }

    public Freteiro insertDB(Freteiro freteiro)
    {
        Freteiro freteiroNovo = repository.saveAndFlush(freteiro);
        return freteiroNovo;
    }

    public Freteiro alterDB(Freteiro freteiro)
    {
        return repository.saveAndFlush(freteiro);
    }

    public void excludeDB(Long id)
    {
        Freteiro freteiroID = repository.findById(id).get();
        repository.delete(freteiroID);
    }
}
