/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.dac.domain;

import java.util.List;

/**
 *
 * @author kaique
 */
public class Participante {

    private int id;
    private String nome;
    private String emial;
    private String nome_cracha;
    private String instituicao;
    private String cpf;
    private String tipo_usuario;
    private String profissao;
    private List<Endereco> endereco;
    private List<Contato> contato;

    public Participante() {
    }

    public Participante(String nome, String emial, String nome_cracha, String instituicao, String cpf, String tipo_usuario, String profissao, List<Endereco> endereco, List<Contato> contato) {
        this.nome = nome;
        this.emial = emial;
        this.nome_cracha = nome_cracha;
        this.instituicao = instituicao;
        this.cpf = cpf;
        this.tipo_usuario = tipo_usuario;
        this.profissao = profissao;
        this.endereco = endereco;
        this.contato = contato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public String getNome_cracha() {
        return nome_cracha;
    }

    public void setNome_cracha(String nome_cracha) {
        this.nome_cracha = nome_cracha;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public List<Contato> getContato() {
        return contato;
    }

    public void setContato(List<Contato> contato) {
        this.contato = contato;
    }

}
