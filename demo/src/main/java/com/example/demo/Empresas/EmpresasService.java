package com.example.demo.Empresas;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresasService 
{
    
    @Autowired
    private EmpresaRepository repository;

    public List<Empresas> searchDB()
    {
        return repository.findAll();
    }

    public Empresas insertDB(Empresas empresa)
    {
        Empresas empresaNova = repository.saveAndFlush(empresa);
        return empresaNova;
    }

    public Empresas alterDB(Empresas empresa)
    {
        return repository.saveAndFlush(empresa);
    }

    public void excludeDB(Long id)
    {
        Empresas empresa = repository.findById(id).get();
        repository.delete(empresa);
    }

}
