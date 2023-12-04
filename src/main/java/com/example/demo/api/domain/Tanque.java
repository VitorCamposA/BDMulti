package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Table(name = "tanque")
@Data
@EqualsAndHashCode(callSuper = true)
public class Tanque extends AbstractBaseId {

    @Column
    private String descricao;

    @Column(name = "capacidade_litros")
    private Long capacidadeLitros;

    //FK VVV

    @Column(name = "id_empresa")
    private Empresa empresa;
}
