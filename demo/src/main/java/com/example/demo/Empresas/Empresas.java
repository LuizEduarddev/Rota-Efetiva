package com.example.demo.Empresas;

import com.example.demo.Carrinho.Carrinho;
import com.example.demo.Produtos.Produtos;
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
import java.util.List;

@Table(name="empresas")
@Entity(name="empresas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idEmpresa")
public class Empresas 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_empresa")
    private long idEmpresa;
    @Column(name="nome_empresa")
    private String nomeEmpresa;
    @Column(name="cnpj_empresa")
    private String cnpjEmpresa;    

    @OneToMany(mappedBy = "empresa")
    private List<Produtos> produtos;

    @OneToMany(mappedBy = "usuario")
    private List<Carrinho> carrinho;
}
