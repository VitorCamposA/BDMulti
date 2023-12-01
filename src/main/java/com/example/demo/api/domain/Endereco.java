package com.example.demo.api.domain;

import com.example.demo.api.domain.base.AbstractBaseId;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;



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
    @ManyToOne
    @JoinColumn(name = "id_bairro")
    private Bairro bairro;

    @ManyToOne
    @JoinColumn(name = "id_tipo_endereco")
    private TipoEndereco tipoEndereco;
}
