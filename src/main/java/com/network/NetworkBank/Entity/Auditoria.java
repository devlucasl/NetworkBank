package com.network.NetworkBank.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "auditoria")
public class Auditoria {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAuditoria;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private String acao;

    private LocalDateTime dataHora;

    @Column(columnDefinition = "TEXT")
    private String detalhes;
}

