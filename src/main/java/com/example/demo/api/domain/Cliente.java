package com.example.demo.api.domain;


import com.example.demo.api.domain.base.AbstractBaseId;
import com.example.demo.api.domain.enums.TipoPessoa;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.Set;

@Table(name = "cliente")
@Data
@EqualsAndHashCode(callSuper = true)
public class Cliente extends AbstractBaseId {


    @Column(name = "razao_social")
    @Nonnull
    private String razaoSocial;

    @Column(name = "nome_fantasia")
    @Nonnull
    private String nomeFantasia;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @Column
    @Nonnull
    private TipoPessoa type;

    @Column
    @Nonnull
    private String document;

    @Column(name = "incricao_estadual")
    private String incricaoEstadual;



    //FK's VVV
    @OneToMany(mappedBy = "cliente")
    private Set<Contato> contatos;

    @Column(name = "id_empresa")
    private Empresa empresa;

    @Column(name = "id_endereco")
    private Endereco endereco;

}
