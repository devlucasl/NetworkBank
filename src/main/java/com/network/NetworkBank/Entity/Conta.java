package com.network.NetworkBank.Entity;

import com.network.NetworkBank.Enums.StatusConta;
import com.network.NetworkBank.Enums.TipoConta;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "conta")
public class Conta {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConta;

    @Column(unique = true)
    private String numeroConta;

    @ManyToOne
    @JoinColumn(name = "id_agencia")
    private Agencia agencia;

    private BigDecimal saldo;

    @Enumerated(EnumType.STRING)
    private TipoConta tipoConta;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    private LocalDateTime dataAbertura;

    @Enumerated(EnumType.STRING)
    private StatusConta status;
}

