package com.example.demo.Usuarios;


import java.util.List;

import com.example.demo.ItemCarrinho.ItemCarrinho;
import com.example.demo.Pedidos.Pedidos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="usuarios")
@Entity(name="usuarios")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idUsuario")
public class Usuarios 
{   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_usuario")
    private Long idUsuario;

    @Column(name = "nome_usuario")
    private String nomeUsuario;

    @Column(name="cpf_usuario")
    private String cpfUsuario;

    @Column(name = "telefone_usuario")
    private String telefoneUsuario; 

    @Column(name = "imagem_cliente")
    private byte[] imagemCliente;

    @Column(name = "cupom_usuario")
    private String cupomUsuario;

    @OneToMany(mappedBy = "usuario")
    private List<ItemCarrinho> carrinho;

    @OneToMany(mappedBy = "usuario")
    private List<Pedidos> pedidos;
}
