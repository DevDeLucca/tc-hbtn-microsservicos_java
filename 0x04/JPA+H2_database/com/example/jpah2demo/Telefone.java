package com.example.jpah2demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Telefone implements Serializable {
    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String DDD;

    @Column
    private String telefone;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Cliente cliente;

    public Telefone() {
    }

    public Telefone(Long id, String DDD, String telefone) {
        this.id = id;
        this.DDD = DDD;
        this.telefone = telefone;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getDDD() {

        return DDD;
    }

    public void setDDD(String DDD) {

        this.DDD = DDD;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public Cliente getCliente() {

        return cliente;
    }

    public void setCliente(Cliente cliente) {

        this.cliente = cliente;
    }
}
