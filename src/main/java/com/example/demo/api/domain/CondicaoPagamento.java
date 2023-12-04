package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import com.example.demo.api.domain.enums.TipoCondicaoPagamento;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Table(name = "condicao_pagamento")
@Data
@EqualsAndHashCode(callSuper = true)
public class CondicaoPagamento extends AbstractBaseId {

    @Column
    private TipoCondicaoPagamento tipo;

    @Column(name = "is_a_prazo")
    private Boolean isAPrazo;

    @Column(name = "prazo_dias")
    private Long prazoDias;

    @Column
    private Long parcelas;

    @Column
    private BigDecimal desconto;

    @Column
    private BigDecimal juros;

    @Column
    private BigDecimal multo;

    //FK VVV

    @Column(name = "id_empresa")
    private Empresa empresa;
}
