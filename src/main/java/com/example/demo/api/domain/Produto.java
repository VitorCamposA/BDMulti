package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import com.example.demo.api.domain.enums.UnidadeMedida;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Table(name = "produto")
@Data
@EqualsAndHashCode(callSuper = true)
public class Produto extends AbstractBaseId {

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private BigDecimal preco;

    @Column(name = "unidade_medida")
    private UnidadeMedida unidadeMedida;

    //FK VVV

    @ManyToOne
    @JoinColumn(name = "id_fornecedor")
    private Fornecedor fornecedor;

    @ManyToOne
    @JoinColumn(name = "id_cst")
    private Cst cst;

    @Column

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Empresa empresa;

    @Column(name = "id_produto_insumo_genero")
    private ProdutoInsumoGenero produtoInsumoGenero ;


}
