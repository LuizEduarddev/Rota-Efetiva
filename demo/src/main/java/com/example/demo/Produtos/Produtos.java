package com.example.demo.Produtos;


import com.example.demo.Empresas.Empresas;
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

@Table(name="produtos")
@Entity(name="produtos")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idProd")
@Data
public class Produtos 
{   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_prod")
    private Long idProd;

    @Column(name = "nome_prod")
    private String nomeProd;

    @Column(name="preco_prod")
    private float precoProd;

    @Column(name = "desconto_prod")
    private String descontoProd;

    @Column(name = "imagem_produto")
    private byte[] imagemProd; 

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresas empresa;
}
