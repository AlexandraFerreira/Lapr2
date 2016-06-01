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
public class ListaOrganizadores {
    
    List<Organizador> m_lOrganizadores;
    
    public ListaOrganizadores() {
        this.m_lOrganizadores = new ArrayList<>();
    }

    public void addOrganizador(Utilizador u){
        Organizador organizador = new Organizador();
        organizador.setUtilizador(u);
        if(validaOrganizador(organizador)){
           add(organizador);
        }
    }
    
    public boolean validaOrganizador(Organizador o){
        if (o.valida()) {
            return true;
        }
        return false;
    }
    
    public boolean valida(ListaOrganizadores o){
        for(Organizador org : this.m_lOrganizadores){
            if (org.valida()) {
                return true;
            }
        }
        return false;
    }

    boolean add(Organizador o) {
       return this.m_lOrganizadores.add(o);
    }
    
}
