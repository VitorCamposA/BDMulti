package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Table(name = "fornecedor")
@Data
@EqualsAndHashCode(callSuper = true)
public class Fornecedor extends AbstractBaseId {

    @Column
    private String tipo;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    //FK VVV

    @Column(name = "id_empresa")
    private Empresa empresa;

    @Column(name = "id_endereco")
    private Endereco endereco;

    @OneToMany(mappedBy = "fornecedor")
    private Set<Produto> produtos;

}
