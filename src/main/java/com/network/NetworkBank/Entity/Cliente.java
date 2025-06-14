package com.network.NetworkBank.Entity;
import jakarta.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "cliente")
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(precision = 5, scale = 2)
    private BigDecimal scoreCredito;
}
