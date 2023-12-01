package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import com.example.demo.api.domain.enums.UnidadeMedida;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Table(name = "insumo")
@Data
@EqualsAndHashCode(callSuper = true)
public class Insumo extends AbstractBaseId {

    @Column
    private String nome;

    @Column(name = "unidade_medida")
    private UnidadeMedida unidadeMedida;

    @Column
    private String descricao;

    //FK VVV

    @ManyToOne
    @JoinColumn(name = "id_fornecedor")
    private Fornecedor fornecedor;

    @Column(name = "id_empresa")
    private Empresa empresa;

    @Column(name = "id_produto_insumo_genero")
    private ProdutoInsumoGenero produtoInsumoGenero ;


}
