package com.example.demo.Veiculos;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class VeiculoService
{
    @Autowired
    private VeiculoRepository repository;
    
    public List<Veiculo> getAllList()
    {
        return repository.findAll();
    }

    public Veiculo insertDB(Veiculo veiculo)
    {
        Veiculo veiculoNovo = repository.saveAndFlush(veiculo);
        return veiculoNovo;
    }

    public Veiculo alterDB(Veiculo veiculo)
    {
        return repository.saveAndFlush(veiculo);
    }

    public void excludeDB(Long id)
    {
        Veiculo veiculoID = repository.findById(id).get();
        repository.delete(veiculoID);
    }
}
