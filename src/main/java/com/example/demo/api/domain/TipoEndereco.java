package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
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

@Table(name = "tipo_endereco")
@Data
@EqualsAndHashCode(callSuper = true)
public class TipoEndereco extends AbstractBaseId {

    private String descricao;


    //FK VVV
    @OneToMany(mappedBy = "tipoEndereco")
    private Set<Endereco> endereco;


}
