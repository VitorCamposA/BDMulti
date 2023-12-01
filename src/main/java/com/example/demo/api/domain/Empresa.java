package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Table(name = "empresa")
@Data
@EqualsAndHashCode(callSuper = true)
public class Empresa extends AbstractBaseId {

    @Column
    private String cnpj;

    @Column(name = "incricao_estadual")
    private String incricaoEstadual;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @Column(name = "mascara_pl_contas")
    private String mascaraPlContas;

    @Column(name = "is_branch_office")
    private Boolean isBranchOffice;

    @OneToMany(mappedBy = "empresa")
    private Set<Cliente> clientes;

    //FK's VVV
    @OneToMany(mappedBy = "empresa")
    private Set<Contato> contatos;

    @Column(name = "id_endereco")
    private Endereco endereco;


}
