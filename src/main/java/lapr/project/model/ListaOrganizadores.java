/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe contém a lista de organizadores.
 * 
 * @author AlexandraFerreira 1140388
 */
public class ListaOrganizadores {
    
    /**
     * A lista de Organizadores.
     */
    List<Organizador> m_lOrganizadores;
    
    /**
     * Constrói uma instância de ListaOrganizadores com todos os valores "vazios".
     */
    public ListaOrganizadores() {
        this.m_lOrganizadores = new ArrayList<>();
    }
    
    /**
     * Devolve a lista de organizadores.
     * 
     * @return a lista de organizadores
     */
    public List<Organizador> getListaOrganizadores(){
        return m_lOrganizadores;
    }

    /**
     * Método que adiciona o utilizador recebido por parâmetro caso este seja válido.
     * 
     * @param u o utilizador a adicionar
     */
    public void addOrganizador(Utilizador u){
        Organizador organizador = new Organizador();
        organizador.setUtilizador(u);
        if(validaOrganizador(organizador)){
           add(organizador);
        }
    }
    
    /**
     * Método que verifica se o organizador é válido.
     * 
     * @param o o organizador a validar
     * @return true caso seja válido, caso contrário devolve false.
     */
    public boolean validaOrganizador(Organizador o){
        if (o.valida()) {
            return true;
        }
        return false;
    }
    
    /**
     * Método que verifica se a lista de organizadores é válida.
     * 
     * @param o o organizador a validar
     * @return true caso seja válido, caso contrário devolve false.
     */
    public boolean valida(ListaOrganizadores o){
        for(Organizador org : this.m_lOrganizadores){
            if (org.valida()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que adiciona o organizador passado por parâmetro à lista de organizadores.
     * 
     * @param o o organizador a validar
     * @return true caso seja válido, caso contrário devolve false.
     */
    boolean add(Organizador o) {
       return this.m_lOrganizadores.add(o);
    }
    
}
