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
public enum ReclamacaoSugestaoEnum {
    
    RECLAMACAO(1),
    SUGESTAO(2);
    
    private final int codigo;
    
    private ReclamacaoSugestaoEnum(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
}
