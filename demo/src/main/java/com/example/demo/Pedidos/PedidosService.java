package com.example.demo.Pedidos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class PedidosService
{
    @Autowired
    private PedidosRepository repository;
    
    public List<Pedidos> getAllList()
    {
        return repository.findAll();
    }

    public Pedidos insertDB(Pedidos pedido)
    {
        Pedidos pedidoNovo = repository.saveAndFlush(pedido);
        return pedidoNovo;
    }

    public Pedidos alterDB(Pedidos pedido)
    {
        return repository.saveAndFlush(pedido);
    }

    public void excludeDB(Long id)
    {
        Pedidos pedidoID = repository.findById(id).get();
        repository.delete(pedidoID);
    }
}
