package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Table(name = "produto_insumo_genero")
@Data
@EqualsAndHashCode(callSuper = true)
public class ProdutoInsumoGenero extends AbstractBaseId {

    @Column
    private Long codigo;

    @Column
    private String descricao;
}
