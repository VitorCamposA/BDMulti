package com.example.demo.tables;


import jakarta.persistence.*;

import java.util.Date;

@Table
public class TableCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date criadoEm;

    @Temporal(TemporalType.TIMESTAMP)
    private Date atualizadoEm;

    private String razaoSocial;

    private String nomeFantasia;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    private String type;

    private String document;

    private String incricaoEstadual;

    @OneToOne
    private Long idContatoFk;

    private Long idEmpresaFk;

    private Long idEnderecoFk;

}
