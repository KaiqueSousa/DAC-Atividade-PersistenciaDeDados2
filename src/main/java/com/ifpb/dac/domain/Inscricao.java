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
public class Inscricao {

    private int id;
    private String data_inscricao;
    private String status_inscricao;
    private double preco;
    private String tipodoevento;
    private String tipodeparticipacao;

    public Inscricao() {
    }

    public Inscricao(String data_inscricao, String status_inscricao, double preco, String tipodoevento, String tipodeparticipacao) {
        this.data_inscricao = data_inscricao;
        this.status_inscricao = status_inscricao;
        this.preco = preco;
        this.tipodoevento = tipodoevento;
        this.tipodeparticipacao = tipodeparticipacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData_inscricao() {
        return data_inscricao;
    }

    public void setData_inscricao(String data_inscricao) {
        this.data_inscricao = data_inscricao;
    }

    public String getStatus_inscricao() {
        return status_inscricao;
    }

    public void setStatus_inscricao(String status_inscricao) {
        this.status_inscricao = status_inscricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipodoevento() {
        return tipodoevento;
    }

    public void setTipodoevento(String tipodoevento) {
        this.tipodoevento = tipodoevento;
    }

    public String getTipodeparticipacao() {
        return tipodeparticipacao;
    }

    public void setTipodeparticipacao(String tipodeparticipacao) {
        this.tipodeparticipacao = tipodeparticipacao;
    }

}
