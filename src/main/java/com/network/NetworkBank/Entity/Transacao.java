package com.network.NetworkBank.Entity;

import com.network.NetworkBank.Enums.TipoTransacao;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transacao")
public class Transacao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTransacao;

    @ManyToOne
    @JoinColumn(name = "id_conta_origem")
    private Conta contaOrigem;

    @ManyToOne
    @JoinColumn(name = "id_conta_destino")
    private Conta contaDestino;

    @Enumerated(EnumType.STRING)
    private TipoTransacao tipoTransacao;

    private BigDecimal valor;

    private LocalDateTime dataHora;

    private String descricao;
}
