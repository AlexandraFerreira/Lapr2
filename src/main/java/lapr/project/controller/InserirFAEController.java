/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.RegistoExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author joste
 */
public class InserirFAEController {
    private Utilizador utilizador;
    private Exposicao exposicao;
    private RegistoExposicoes re;
     
    /**
     * Constrói uma instância de DefinirFAE, passando por
     * parâmetro uma exposicao e um utilizador (futuro FAE).
     * @param exposicao
     * @param utilizador
     */
    public InserirFAEController(Exposicao exposicao, Utilizador utilizador){
        this.exposicao = exposicao;
        this.utilizador = utilizador;
    }
    
    public void getRegistoExposicoes(Exposicao exposicao){
        
    }
    
    
    public FAE adicionarFAE(){
        FAE fae = new FAE(this.exposicao, this.utilizador.getNome(), this.utilizador.getEmail(), this.utilizador.getUsername(), this.utilizador.getPassword());  
        return fae;
    }
    
}
