package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "funcionario")
@Data
@EqualsAndHashCode(callSuper = true)
public class Funcionario extends AbstractBaseId {

    @Column
    @Nonnull
    private String nome;

    @Column
    @Nonnull
    private String sobrenome;

    @Column
    @Nonnull
    private String cargo;

    @Column
    @Nonnull
    private BigDecimal salario;

    @Column(name = "data_contratacao")
    private Date dataContratacao;

    //FK VVV

    @Column(name = "id_empresa")
    private Empresa empresa;
}
