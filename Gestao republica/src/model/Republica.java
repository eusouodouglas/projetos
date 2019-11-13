/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Douglas e Francisco
 */
public class Republica {
    
    protected int id;
    protected String nome;
    protected String dataFuncacao;
    protected String dataExtincao;
    protected String enderecoCompleto;
    protected String localizacaoGeografica;
    protected String vantagens;
    protected double despesasMedia;
    protected int totalVagas;
    protected int vagasOcupadas;
    protected int vagasDisponiveis;
    
    

    public Republica() {
    }

    public Republica(int id, String nome, String dataFuncacao, String dataExtincao, String endereco, int numero, int cep, String referencia, String localizacaoGeografica, String vantagens, double despesasMedia, int totalVagas, int vagasOcupadas, int vagasDisponiveis, String inicio, String fim, double reputacao) {
        this.id = id;
        this.nome = nome;
        this.dataFuncacao = dataFuncacao;
        this.dataExtincao = dataExtincao;
        this.localizacaoGeografica = localizacaoGeografica;
        this.vantagens = vantagens;
        this.despesasMedia = despesasMedia;
        this.totalVagas = totalVagas;
        this.vagasOcupadas = vagasOcupadas;
        this.vagasDisponiveis = vagasDisponiveis;
        
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

    public String getDataFuncacao() {
        return dataFuncacao;
    }

    public void setDataFuncacao(String dataFuncacao) {
        this.dataFuncacao = dataFuncacao;
    }

    public String getDataExtincao() {
        return dataExtincao;
    }

    public void setDataExtincao(String dataExtincao) {
        this.dataExtincao = dataExtincao;
    }

    public String getLocalizacaoGeografica() {
        return localizacaoGeografica;
    }

    public void setLocalizacaoGeografica(String localizacaoGeografica) {
        this.localizacaoGeografica = localizacaoGeografica;
    }

    public String getVantagens() {
        return vantagens;
    }

    public void setVantagens(String vantagens) {
        this.vantagens = vantagens;
    }

    public double getDespesasMedia() {
        return despesasMedia;
    }

    public void setDespesasMedia(double despesasMedia) {
        this.despesasMedia = despesasMedia;
    }

    public int getTotalVagas() {
        return totalVagas;
    }

    public void setTotalVagas(int totalVagas) {
        this.totalVagas = totalVagas;
    }

    public int getVagasOcupadas() {
        return vagasOcupadas;
    }

    public void setVagasOcupadas(int vagasOcupadas) {
        this.vagasOcupadas = vagasOcupadas;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }
    
    
    
}

