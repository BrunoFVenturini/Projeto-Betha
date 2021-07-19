package com.brunov.clientes.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    @Column(unique = true)
    private String cpf;
    private String tipo;
    private String endereco;
    private String telefone;
    private String imageUrl;


    public Cliente() { }

    public Cliente(Long id, String name, String cpf, String tipo, String endereco, String telefone, String imageUrl) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.tipo = tipo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.imageUrl = imageUrl;
    }


    @Column(nullable = false, updatable = false)



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String toString(){
        return "Cliente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tipo='" + tipo + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", cpf='" + cpf +'\'' +
                '}';
    }

}
