package com.example.demo.api.domain;


import com.example.demo.api.domain.base.AbstractBaseId;
import com.example.demo.api.domain.enums.TipoPessoa;
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
    private String razaoSocial;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @Column
    private TipoPessoa type;

    @Column
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
