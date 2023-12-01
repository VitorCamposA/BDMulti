package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.Set;

@Table(name = "estado")
@Data
@EqualsAndHashCode(callSuper = true)
public class Estado extends AbstractBaseId {

    @Column
    private String nome;

    //FK's VVV
    @ManyToOne
    @JoinColumn(name = "id_pais")
    private Pais pais;

    @OneToMany(mappedBy = "estado")
    private Set<Cidade> cidades;

}
