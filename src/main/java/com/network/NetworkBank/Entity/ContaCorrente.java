package com.network.NetworkBank.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "conta_corrente")
public class ContaCorrente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContaCorrente;

    @OneToOne
    @JoinColumn(name = "id_conta")
    private Conta conta;

    private BigDecimal limite;

    private LocalDate dataVencimento;

    private BigDecimal taxaManutencao;
}
