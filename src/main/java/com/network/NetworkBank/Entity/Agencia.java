package com.network.NetworkBank.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "agencia")
public class Agencia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAgencia;

    private String nome;

    @Column(unique = true)
    private String codigoAgencia;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
}

