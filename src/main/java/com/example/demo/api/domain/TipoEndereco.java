package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
