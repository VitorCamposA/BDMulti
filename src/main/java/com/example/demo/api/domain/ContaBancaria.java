package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Table(name = "conta_bancaria")
@Data
@EqualsAndHashCode(callSuper = true)
public class ContaBancaria extends AbstractBaseId {

    @Column
    private String banco;

    @Column
    private String agencia;

    @Column(name = "numero_conta")
    private String numeroConta;

    @Column(name = "saldo_inicial")
    private BigDecimal saldoInicial;

    @Column
    private BigDecimal saldo;

    //FK VVV

    @Column(name = "id_empresa")
    private Empresa empresa;

}
