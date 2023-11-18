package com.example.demo.Carrinho;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.example.demo.ItemCarrinho.ItemCarrinho;
import com.example.demo.Usuarios.Usuarios;
import java.util.List;


@Table(name="carrinho")
@Entity(name="carrinho")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idCarrinho")
public class Carrinho 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_carrinho")
    private long idCarrinho;
    @Column(name="id_usuario")
    private String idUsuario;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuarios usuario;

    @OneToMany(mappedBy = "carrinho")
    private List<ItemCarrinho> carrinho;

}
