package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Table(name = "cidade")
@Data
@EqualsAndHashCode(callSuper = true)
public class Cidade extends AbstractBaseId {

    @Column
    private String nome;

    //FK's VVV
    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    @OneToMany(mappedBy = "cidade")
    private Set<Bairro> bairros;

}
