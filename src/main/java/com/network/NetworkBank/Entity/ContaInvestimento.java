package com.network.NetworkBank.Entity;
import com.network.NetworkBank.Enums.PerfilRisco;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "conta_investimento")
public class ContaInvestimento {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContaInvestimento;

    @OneToOne
    @JoinColumn(name = "id_conta")
    private Conta conta;

    @Enumerated(EnumType.STRING)
    private PerfilRisco perfilRisco;

    private BigDecimal valorMinimo;

    private BigDecimal taxaRendimentoBase;
}
