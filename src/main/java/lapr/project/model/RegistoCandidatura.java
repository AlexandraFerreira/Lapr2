/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import lapr.project.model.Candidatura;

/**
 *
 * @author Fábio Sousa
 */
public class RegistoCandidatura {

    /**
     * Método que cria uma nova candidatura sem parâmetros, mais tarde se faz os
     * set para adicionar os novos atributos da candidatura
     *
     * @return
     */
    public Candidatura criarCandidatura() {
        return new Candidatura();
    }

    /**
     *  Método que valida a candidatura 
     * @return true or false de acordo consoante a validação da candidatura
     */
    public boolean validaCandidatura() {
        return true;
    }
    /**
     * Método que regista a candidatura após tudo verificado
     */
    public void registaCandidatura(){
    
    }
}
