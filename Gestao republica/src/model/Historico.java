/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Douglas
 */
public class Historico {
    
    protected String nomeRepublica;
    protected String nomeRepresentante;
    protected String contato;
    protected double mediaReputacao;

    public Historico() {
    }

    public Historico(String nomeRepublica, String nomeRepresentante, String contato, double mediaReputacao) {
        this.nomeRepublica = nomeRepublica;
        this.nomeRepresentante = nomeRepresentante;
        this.contato = contato;
        this.mediaReputacao = mediaReputacao;
    }

    public String getNomeRepublica() {
        return nomeRepublica;
    }

    public void setNomeRepublica(String nomeRepublica) {
        this.nomeRepublica = nomeRepublica;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public double getMediaReputacao() {
        return mediaReputacao;
    }

    public void setMediaReputacao(double mediaReputacao) {
        this.mediaReputacao = mediaReputacao;
    }
    
    
}
