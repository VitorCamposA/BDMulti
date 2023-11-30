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

@Table(name = "cidade")
@Data
@EqualsAndHashCode(callSuper = true)
public class Cidade extends AbstractBaseId {

    @Column
    private String nome;

    @OneToMany(mappedBy = "cidade")
    private Set<Bairro> bairros;

    //FK's VVV
    @Column(name = "id_estado")
    private Estado estado;

}
