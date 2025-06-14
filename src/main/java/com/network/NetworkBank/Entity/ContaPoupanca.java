package com.network.NetworkBank.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "conta_poupanca")
public class ContaPoupanca {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContaPoupanca;

    @OneToOne
    @JoinColumn(name = "id_conta")
    private Conta conta;

    private BigDecimal taxaRendimento;

    private LocalDateTime ultimoRendimento;
}
