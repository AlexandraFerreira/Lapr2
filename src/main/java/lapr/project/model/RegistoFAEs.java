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
    List<FAE> listFAEs;
    
     public RegistoFAEs(){
        listFAEs=new ArrayList<>();
    }
    
     public FAE novoFAE(Exposicao exposicao, String nome, String email, String username, String password){
        return new FAE(exposicao, nome, email, username, password);
    }
     
    /* public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }

        FAE outroFAE = (FAE) outroObjeto;

        return titulo.equalsIgnoreCase(outraExposicao.titulo)
                && text_descritivo.equalsIgnoreCase(outraExposicao.text_descritivo)
                && dataInicio == outraExposicao.dataInicio
                && dataFim == outraExposicao.dataFim
                && local.equalsIgnoreCase(outraExposicao.local)
                && lista_Organizadores == outraExposicao.lista_Organizadores;
    }*/
}
