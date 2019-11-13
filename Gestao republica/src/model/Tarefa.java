/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Douglas e Francisco
 */
public class Tarefa {
    
    protected String dataAgendamento;
    protected ArrayList<Pessoa> moradoresResponsaveis;
    protected String descricao;
    protected String dataTermino;
    protected boolean status = false;

    public Tarefa() {
    }

    public Tarefa(String dataAgendamento, ArrayList<Pessoa> moradoresResponsaveis, String descricao, String dataTermino, boolean status) {
        this.dataAgendamento = dataAgendamento;
        this.moradoresResponsaveis = moradoresResponsaveis;
        this.descricao = descricao;
        this.dataTermino = dataTermino;
        this.status = status;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public ArrayList<Pessoa> getMoradoresResponsaveis() {
        return moradoresResponsaveis;
    }

    public void setMoradoresResponsaveis(ArrayList<Pessoa> moradoresResponsaveis) {
        this.moradoresResponsaveis = moradoresResponsaveis;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
