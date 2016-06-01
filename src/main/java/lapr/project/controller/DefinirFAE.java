/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;
import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Exposicao;
import lapr.project.model.FAE;
import lapr.project.model.Utilizador;

/**
 *
 * @author joste
 */
public class DefinirFAE {
    private Utilizador utilizador;
    private Exposicao exposicao;
    
    public DefinirFAE(Exposicao exposicao, Utilizador utilizador){
        this.exposicao = exposicao;
        this.utilizador = utilizador;
    }
    
    public void adicionarFAE(Exposicao exposicao){
        FAE fae = new FAE(this.exposicao, this.utilizador.getNome(), this.utilizador.getEmail(), this.utilizador.getUsername(), this.utilizador.getPassword());
        
    }
    
}
