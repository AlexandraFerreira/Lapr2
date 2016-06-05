/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe trata do registo das exposições.
 * 
 * @author AlexandraFerreira 1140388
 */
public class RegistoExposicoes {
    
    /**
     * Lista de Exposições do sistema
     */
    List<Exposicao> listExposicoes;
  
    /**
     * Constrói uma instância de RegistoExposicoes sem parâmetros.
     */
    public RegistoExposicoes(){
        listExposicoes=new ArrayList<>();
    }
    
    /**
     * Método que cria uma nova instância de Exposição.
     * 
     * @return a nova Exposição
     */
    public Exposicao novaExposicao(){
        return new Exposicao();
    }
    
    /**
     * Método que valida a exposição recebida por parâmetro.
     * 
     * @param e a exposição a validar
     * @return  true caso seja válida, caso contrário return false
     */
    public boolean validaExposicao(Exposicao e){
        if (e.valida()) {
            return true;
        }
        return false;
    }
    
    /**
     * Método que regista a exposição recebida por parâmetro, adicionando-a à 
     * lista de exposições.
     * 
     * @param e a exposição a registar
     * @return boolean com resultado da operação
     */
    public boolean registaExposicao(Exposicao e){
        if(e.valida() && validaExposicao(e)){
            add(e);
            return true;
        }
        return false;
    }
    
    /**
     * Método que adiciona uma exposição a uma lista de exposições.
     * 
     * @param e a exposição a adicionar
     */
    public void add(Exposicao e){
        listExposicoes.add(e);
    }
    
    public void listarExposicoes(Exposicao e){
        listExposicoes.toString();
    }
}
