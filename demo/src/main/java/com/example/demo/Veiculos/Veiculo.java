package com.example.demo.Veiculos;

import com.example.demo.Freteiro.Freteiro;
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

@Table(name="veiculos")
@Entity(name="veiculos")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idVeiculo")
public class Veiculo 
{   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_veiculo")
    private Long idVeiculo;

    @Column(name = "placa_veiculo")
    private String placaVeiculo;

    @Column(name="modelo_veiculo")
    private String modeloVeiculo;

    @Column(name = "ano_veiculo")
    private String anoVeiculo; 

    @Column(name = "cor_veiculo")
    private String corVeiculo;

    @Column(name = "imagem_veiculo")
    private byte[] imagemVeiculo;

    @ManyToOne
    @JoinColumn(name = "id_freteiro")
    private Freteiro freteiro;
}