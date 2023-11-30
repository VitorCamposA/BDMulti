package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
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
    @Column(name = "id_contato")
    private Contato contato;

    @Column(name = "id_endereco")
    private Endereco endereco;


}
