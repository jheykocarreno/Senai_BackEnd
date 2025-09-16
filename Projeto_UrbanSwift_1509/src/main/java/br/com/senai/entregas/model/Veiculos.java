package br.com.senai.entregas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "veiculos")

public class Veiculos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "veiculo_id", nullable = false)
    private Integer veiculoId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "entregador_id")
    private Usuario usuario_id;

    @Column(name = "placa", nullable = false,  unique = true, columnDefinition = "TEXT")
    private String placa;

    @Column(name = "modelo", nullable = false, columnDefinition = "TEXT")
    private String modelo;

    @Column(name = "tipo", nullable = false, columnDefinition = "TEXT")
    private String tipo;

}

