package com.network.NetworkBank.Entity;

import com.network.NetworkBank.Enums.CargoFuncionario;
import jakarta.persistence.*;

@Entity
@Table(name = "funcionario")
public class Funcionario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFuncionario;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(unique = true, nullable = false)
    private String codigoFuncionario;

    @Enumerated(EnumType.STRING)
    private CargoFuncionario cargo;

    @ManyToOne
    @JoinColumn(name = "id_supervisor")
    private Funcionario supervisor;
}

