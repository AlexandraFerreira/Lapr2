/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe devolve a lista de atribuicoes.
 * @author Cristiano Melo
 */
public class ListaAtribuicoes {
    
    /**
     * Declaração da variável de instância lAtribuicoes que contém uma lista de
     * atribuições
     */
    List<Atribuicao> lAtribuicoes;
    /**
     * Decliaração da variável de instância atribuicao a que guardará uma Atribuição
     */
    Atribuicao atribuicao;
    
    /**
     * Este construtor inicia todos os parâmetros e inicializa-os com os valores
     * indicados por parâmetro
     * @param lAtribuicoes
     * @param atribuicao 
     */
    public ListaAtribuicoes(List<Atribuicao> lAtribuicoes, Atribuicao atribuicao){
        this.lAtribuicoes=lAtribuicoes;
        this.atribuicao=atribuicao;
    }
    
    /**
     * Construtor vazio que inicializa todas as variáveis de instância com os
     * valores por defeito.
     */
    public ListaAtribuicoes(){
        this.lAtribuicoes= new ArrayList<>();
        this.atribuicao= new Atribuicao();
        
        
    }
    

}
