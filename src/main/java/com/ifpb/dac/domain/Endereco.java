/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.dac.domain;

/**
 *
 * @author kaique
 */
public class Endereco {
    
    private int id;
    private String estado;
    private String cidade;
    private String bairro;
    private String logadouro;
    private String numero;
    private String cep;

    public Endereco() {
    }

    public Endereco(String estado, String cidade, String bairro, String logadouro, String numero, String cep) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logadouro = logadouro;
        this.numero = numero;
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
}
