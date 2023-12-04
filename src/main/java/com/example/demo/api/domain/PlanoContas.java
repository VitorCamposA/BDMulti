package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import com.example.demo.api.domain.enums.TipoPlanoContas;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Table(name = "condicao_pagamento")
@Data
@EqualsAndHashCode(callSuper = true)
public class PlanoContas extends AbstractBaseId {

    @Column
    private Long codigo;

    @Column
    private TipoPlanoContas tipo;

    @Column(name = "nome_conta")
    private String nomeConta;

    @Column(name = "tipo_conta")
    private String tipoConta;

    @Column
    private BigDecimal saldo;

    //FK VVV

    @Column(name = "id_plano_contas_pai")
    private PlanoContas planoContasPai;

    @Column(name = "id_empresa")
    private Empresa empresa;
}
