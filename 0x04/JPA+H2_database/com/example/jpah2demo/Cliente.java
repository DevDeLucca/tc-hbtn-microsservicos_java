package com.example.jpah2demo.entities;

import java.util.List;
import javax.persistence.*;
import java.util.ArrayList;
import java.io.Serializable;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente implements Serializable {
    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cli_name", nullable = false)
    private String nome;

    @Column(name = "cli_email", nullable = false)
    private String email;

    @Column(name = "cli_cpf", nullable = false)
    private String cpf;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "cliente_id")
    private List<Telefone> telefones = new ArrayList<>();

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name = "cliente_id")
    private List<Endereco> enderecos = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(Long id, String nome, List<Telefone> telefones, List<Endereco> enderecos) {
        this.id = id;
        this.nome = nome;
        this.telefones = telefones;
        this.enderecos = enderecos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Telefone> getTelefones() {

        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {

        this.telefones = telefones;
    }

    public List<Endereco> getEnderecos() {

        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {

        this.enderecos = enderecos;
    }

}
