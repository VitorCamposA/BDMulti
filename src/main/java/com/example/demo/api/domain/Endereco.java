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

@Table(name = "endereco")
@Data
@EqualsAndHashCode(callSuper = true)
public class Endereco extends AbstractBaseId {

    @Column
    private String rua;

    @Column
    private String numero;

    @Column
    private String complemento;

    //FK's VVV
    @Column(name = "id_bairro")
    private Bairro bairro;

    @Column(name = "id_tipo_endereco")
    private TipoEndereco tipoEndereco;
}
