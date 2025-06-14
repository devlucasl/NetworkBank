package com.network.NetworkBank.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEndereco;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private String cep;
    private String local;
    private Integer numeroCasa;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;
}

