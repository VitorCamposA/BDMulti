package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Table(name = "cst")
@Data
@EqualsAndHashCode(callSuper = true)
public class Cst extends AbstractBaseId {

    @Column
    @Nonnull
    private String descricao;

    @Column(name = "cst_ism")
    private Long cstIsm;

    @Column(name = "perc_ism")
    private BigDecimal percIsm;

    @Column(name = "cst_pis")
    private Long cstPis;

    @Column(name = "perc_pis")
    private BigDecimal percPis;

    @Column(name = "cst_cofins")
    private Long cstCofins;

    @Column(name = "perc_cofins")
    private BigDecimal percCofins;

    //FK VVV

    @Column
    private Empresa empresa;

}
