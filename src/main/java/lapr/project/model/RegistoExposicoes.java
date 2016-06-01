/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public class RegistoExposicoes {
    
    List<Exposicao> listExposicoes;
  
    public RegistoExposicoes(){
        listExposicoes=new ArrayList<>();
    }
    
    public Exposicao novaExposicao(){
        return new Exposicao();
    }
    
    public void validaExposicao(Exposicao e){
        
    }
    
    public void registaExposicao(Exposicao e){
        
    }
    
    public void add(Exposicao e){
        
    }
}
