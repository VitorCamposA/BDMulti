package com.example.demo.tables;

import jakarta.persistence.*;

import java.util.Date;

@Table
public class TableEndereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date criadoEm;

    @Temporal(TemporalType.TIMESTAMP)
    private Date atualizadoEm;

    private String rua;

    private String numero;

    private String complemento;

    private Long idBairroFk; //fazer table bairro

    private Long idTipoEnderecoFk;//fazer table TipoEndereco
}
