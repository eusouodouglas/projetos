/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Douglas
 */
public class Pessoa {
    
    protected int id;
    protected String nome;
    protected String senha;
    protected String apelido;
    protected Enum papel;
    protected int fixo;
    protected int celular;
    protected String link;
    protected String inicio;
    protected String fim;
    protected double reputacao;
    
    private ArrayList<Historico> historicoRepublica;
    
    public Pessoa() {
    }

    public Pessoa(int id, String nome, Enum papel, String senha, String apelido, int fixo, int celular, String link, String inicio, String fim, double reputacao) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.apelido = apelido;
        this.fixo = fixo;
        this.celular = celular;
        this.link = link;
        this.inicio = inicio;
        this.fim = fim;
        this.reputacao = reputacao;
        this.papel = papel;
        
        historicoRepublica = new ArrayList<>();
    }

    public Enum getPapel() {
        return papel;
    }

    public void setPapel(Enum papel) {
        this.papel = papel;
    }
    

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public double getReputacao() {
        return reputacao;
    }

    public void setReputacao(double reputacao) {
        this.reputacao = reputacao;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getFixo() {
        return fixo;
    }

    public void setFixo(int fixo) {
        this.fixo = fixo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
}
