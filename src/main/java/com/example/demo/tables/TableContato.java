package com.example.demo.tables;

import jakarta.persistence.*;

import java.util.Date;

@Table
public class TableContato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date criadoEm;

    @Temporal(TemporalType.TIMESTAMP)
    private Date atualizadoEm;

    private String nomeContato;

    private String email;

    private String telefone;

    private Long idEmpresaFk;
}
