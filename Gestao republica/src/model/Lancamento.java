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
public class Lancamento {
    
    protected LancamentoEnum tipo;
    protected String descricao;
    protected String dataVencimento;
    protected double valor;
    protected String periodicidade;
    protected double valorParcela;
    protected ArrayList<Pessoa> moradoresParticipantes;

    public Lancamento() {
    }

    public Lancamento(LancamentoEnum tipo, String descricao, String dataVencimento, double valor, String periodicidade, double valorParcela, ArrayList<Pessoa> moradoresParticipantes) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
        this.periodicidade = periodicidade;
        this.valorParcela = valorParcela;
        this.moradoresParticipantes = moradoresParticipantes;
    }

    public LancamentoEnum getTipo() {
        return tipo;
    }

    public void setTipo(LancamentoEnum tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(double valorParcela) {
        this.valorParcela = valorParcela;
    }

    public ArrayList<Pessoa> getMoradoresParticipantes() {
        return moradoresParticipantes;
    }

    public void setMoradoresParticipantes(ArrayList<Pessoa> moradoresParticipantes) {
        this.moradoresParticipantes = moradoresParticipantes;
    }
    
    
    
}
