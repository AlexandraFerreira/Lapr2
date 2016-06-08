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
    public List<Organizador> getListaOrganizadores() {
        return this.m_lOrganizadores;
    }

    /**
     * Método que verifica se o organizador é valido permitindo que este seja
     * adicionado á lista de organizadores
     *
     * @param u objeto do tipo Utilizador que identifica o proponente
     * @return boolean do resultado da validação
     */
    public boolean addOrganizador(Utilizador u) {
        if (u == null) {
            return false;
        }

        Organizador o = new Organizador(u);

        if (validaOrganizador(o)) {
            return addOrganizador(o);
        } else {
            System.out.println("Organizador não registado.\n");
            return false;
        }
    }
    
    /**
     * Método que adiciona o Organizador á lista de Organizadores
     *
     * @param o objeto do tipo Oraganizador
     * @return boolean do resultado da validação
     */
    public boolean addOrganizador(Organizador o) {
        return this.m_lOrganizadores.add(o);
    }

    /**
     * Método que remove o Organizador da lista de Organizadores
     *
     * @param o objeto do tipo Oraganizador
     * @return boolean do resultado da validação
     */
    public boolean removeOrganizador(Organizador o) {
        return this.m_lOrganizadores.remove(o);
    }

    /**
     * Método que verifica se o organizador já consta na lista de Organizadores
     *
     * @param o objeto do tipo Organizador
     * @return boolean do resultado da operação
     */
    public boolean validaOrganizador(Organizador o) {
        if (m_lOrganizadores.contains(o)) {
            System.out.println("Utilizador ja consiste na lista de Organizadores");
            return false;
        } else if (o.valida()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que verifica se a lista de organizadores está vazia ou não
     *
     * @return boolean do resultado da validação
     */
    public boolean valida() {
        if (m_lOrganizadores.isEmpty()) {
            System.out.println("Lista de Organizadores vazia.\nEvento não registado!");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Método que verifica se o organizador está na lista de organizadores
     *
     * @param strID objeto do tipo String que identifica o organizador
     * @return boolean do resultado da operação
     */
    public boolean hasOrganizador(String strID) {
        for (Organizador org : this.m_lOrganizadores) {
            if (org.getUtilizador().getUsername().equals(strID)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que retorna o tamanho da lista de organizadores(ou seja o seu
     * número de elementos)
     *
     * @return tamanho da lista de organizadores
     */
    public int tamanho() {
        return this.m_lOrganizadores.size();
    }

    /**
     * Método que permite consultar um Organizador da lista recebendo como
     * parâmetro a sua posição na lista
     *
     * @param index posição na lista
     * @return Organizador pretendido
     */
    public Organizador obterOrganizador(int index) {
        return m_lOrganizadores.get(index);
    }

    /**
     * Método que retorna a posição do Organizador,se este não exitir retorna -1
     *
     * @param o objeto do tipo Organizador
     * @return osição do Organizador
     */
    public int indiceDe(Organizador o) {
        return this.m_lOrganizadores.indexOf(o);
    }

    /**
     * Método que retorna um ArrayList contendo a lista de Organizadores
     *
     * @return ArrayList
     */
    public Organizador[] toArray() {
        return this.m_lOrganizadores.toArray(new Organizador[this.m_lOrganizadores.size()]);
    }

    /**
     * Método que permite alterar a lista de Organizadores
     *
     * @param m_listaOrganizadores objeto do tipo ArrayList
     */
    public void setListaOrganizadores(List<Organizador> m_listaOrganizadores) {
        this.m_lOrganizadores = m_listaOrganizadores;
    }

    /**
     * Método que retorna a informação da lista de organizadores
     *
     * @return informação da lista de organizadores
     */
    @Override
    public String toString() {
        String returnString = "";
        for (Organizador org : this.m_lOrganizadores) {
            returnString += org.toString();
        }
        return returnString;
    }
}
