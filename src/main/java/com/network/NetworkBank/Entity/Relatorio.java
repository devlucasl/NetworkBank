package com.network.NetworkBank.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "relatorio")
public class Relatorio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRelatorio;

    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;

    private String tipoRelatorio;

    private LocalDateTime dataGeracao;

    @Column(columnDefinition = "TEXT")
    private String conteudo;
}
