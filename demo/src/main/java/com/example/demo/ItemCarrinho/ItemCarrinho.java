package com.example.demo.ItemCarrinho;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.example.demo.Carrinho.Carrinho;
import com.example.demo.Produtos.Produtos;

@Table(name="itens_carrinho")
@Entity(name="itens_carrinho")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idItemCarrinho")
public class ItemCarrinho 
{   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_freteiro")
    private Long idFreteiro;

    @Column(name = "quantidade_itens")
    private String quantidadeItens;

    @ManyToOne
    @JoinColumn(name = "id_carrinho")
    private Carrinho carrinho;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produtos produto;
}
