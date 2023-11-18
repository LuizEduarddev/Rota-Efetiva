package com.example.demo.Pedidos;

import com.example.demo.Usuarios.Usuarios;
import com.example.demo.Endereco.Endereco;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="pedidos")
@Entity(name="pedidos")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idPedidos")
@Data
public class Pedidos 
{   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_pedido")
    private Long idPedidos;

    @Column(name="forma_pagamento")
    private String formaPagamento;

    @Column(name="status_pedido")
    private String statusPedido;

    @Column(name="total_pedido")
    private String totalPedido;

    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuarios usuario;

    @ManyToOne
    @JoinColumn(name="id_endereco")
    private Endereco endereco;
}
