package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
@Table(name = "bairro")
@Data
@EqualsAndHashCode(callSuper = true)
public class Bairro extends AbstractBaseId {

    @Column
    private String nome;

    //FK's VVV
    @ManyToOne
    @Column(name = "id_cidade")
    private Cidade cidade;

}
