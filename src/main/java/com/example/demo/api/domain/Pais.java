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

@Table(name = "pais")
@Data
@EqualsAndHashCode(callSuper = true)
public class Pais extends AbstractBaseId {

    @Column
    private String nome;

    //FK VVV
    @OneToMany(mappedBy = "pais")
    private Set<Estado> estados;


}
