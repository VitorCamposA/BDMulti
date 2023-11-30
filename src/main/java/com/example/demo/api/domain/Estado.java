package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
@Table(name = "estado")
@Data
@EqualsAndHashCode(callSuper = true)
public class Estado extends AbstractBaseId {

    @Column
    private String nome;

    //FK's VVV
    @Column(name = "id_pais")
    private Pais pais;

}
