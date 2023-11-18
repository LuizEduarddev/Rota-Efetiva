package com.example.demo.Endereco;

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
import java.util.List;

@Table(name="endereco")
@Entity(name="endereco")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idEndereco")
public class Endereco 
{   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_endereco")
    private Long idEndereco;

    @Column(name = "lugar_endereco")
    private String lugarEndereco;

    @Column(name="numero_endereco")
    private String numeroEndereco;

    @Column(name = "complemente_endereco")
    private String complementoEndereco; 

    @Column(name = "ponto_referencia_endereco")
    private String pontoReferencia;

    @OneToMany(mappedBy = "endereco")
    private List<Pedidos> pedidos;
}