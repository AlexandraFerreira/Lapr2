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
 * @author joste
 */
public class RegistoFAEs {
    /**
     * Lista de FAEs do sistema
    */
    List<FAE> listFAE;
    
    /**
     * Este construtor cria uma nova lista de FAE's
    */
    public RegistoFAEs(){
        listFAE=new ArrayList<>();
    }
    
    /**
     * Este construtor inicializa a lista de FAE's com a lista enviada por
     * parâmetro
     *
     * @param listFAE que guarda uma lista de FAE's
     */
     public RegistoFAEs(List<FAE> listFAE){
        this.listFAE = listFAE;
    }
     
    /**
     * @return a lista de FAE's
    */
    public List<FAE> getListFAEs() {
        for (FAE fae : listFAE) {
            if (fae != null) {
                listFAE.add(fae);
            }
        }
        return listFAE;
    }
     
    /**
     * Este metodo adiciona um novo FAE à lista e cria um novo FAE
     * @param fae a adicionar
    */
    private void addFAE(FAE fae) {
        if (validaListaFAEs(fae)) {
            FAE f=fae;
            listFAE.add(fae);
        }
    }
       
    /**
     * Este método valida o FAE
     * @param fae a ser validado
     * @return se o FAE é válido (true ou false)
    */
    private boolean validaListaFAEs(FAE fae) {
        return listFAE.contains(fae);
    }
     
}
