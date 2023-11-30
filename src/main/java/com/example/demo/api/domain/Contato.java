package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Table(name = "contato")
@Data
@EqualsAndHashCode(callSuper = true)
public class Contato extends AbstractBaseId {

    @Column(name = "nome_contato")
    private String nomeContato;

    @Column
    private String email;

    @Column
    private String telefone;

    //FK's VVV
    @Column(name = "id_empresa")
    private Empresa empresa;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
}
