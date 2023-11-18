package com.example.demo.Freteiro;

import com.example.demo.Veiculos.Veiculo;
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


@Table(name="freteiro")
@Entity(name="freteiro")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idFreteiro")
public class Freteiro 
{   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_freteiro")
    private Long idFreteiro;

    @Column(name = "nome_freteiro")
    private String nomeFreteiro;
    
    @Column(name = "numero_freteiro")
    private String numeroFreteiro; 

    @Column(name="cpf_freteiro")
    private String cpfFreteiro;

    @Column(name = "imagem_freteiro")
    private byte[] imagemFreteiro;

    @OneToMany(mappedBy = "freteiro")
    private List<Veiculo> veiculo;
}
