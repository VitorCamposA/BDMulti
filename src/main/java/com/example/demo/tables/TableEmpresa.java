package com.example.demo.tables;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Table
public class TableEmpresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date criadoEm;

    @Temporal(TemporalType.TIMESTAMP)
    private Date atualizadoEm;

    private String cnpj;

    private String incricaoEstadual;

    private String razaoSocial;

    private String nomeFantasia;

    private Long idContatoFk;

    private Long idEnderecoFk;

    private String mascaraPlContas;

    private boolean isBranchOffice;


}
