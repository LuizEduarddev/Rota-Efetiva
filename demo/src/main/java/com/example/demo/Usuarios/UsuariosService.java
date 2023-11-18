package com.example.demo.Usuarios;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class UsuariosService 
{
    @Autowired
    private UsuariosRepository repository;
    
    public List<Usuarios> getAllList()
    {
        return repository.findAll();
    }

    public Usuarios insertDB(Usuarios usuario)
    {
        Usuarios usuarioNovo = repository.saveAndFlush(usuario);
        return usuarioNovo;
    }

    public Usuarios alterDB(Usuarios usuario)
    {
        return repository.saveAndFlush(usuario);
    }

    public void excludeDB(Long id)
    {
        Usuarios usuarioID = repository.findById(id).get();
        repository.delete(usuarioID);
    }
}
