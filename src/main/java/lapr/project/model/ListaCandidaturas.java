/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe contém a lista de candidaturas.
 *
 * @author AlexandraFerreira 1140388
 */
public class ListaCandidaturas {

    /**
     * A lista de Candidaturas.
     */
    List<CandidaturaAExposicao> listaCandidaturas;

    /**
     * Constrói uma instância de ListaCandidaturas com todos os valores "vazios".
     */
    public ListaCandidaturas() {
        this.listaCandidaturas = new ArrayList<>();
    }

    /**
     * Devolve a lista de candidaturas.
     *
     * @return a lista de candidaturas
     */
    public List<CandidaturaAExposicao> getListaCandidaturas() {
        return this.listaCandidaturas;
    }

    /**
     * Método que verifica se a candidatura é valida permitindo que esta seja
     * adicionada á lista de candidaturas
     *
     * @param c objeto do tipo Candidatura
     * @return boolean do resultado da validação
     */
    public boolean addCandidatura(CandidaturaAExposicao c) {

        if (validaCandidatura(c)) {
            return this.listaCandidaturas.add(c);
        } else {
            System.out.println("Candidatura não registada.\n");
            return false;
        }
    }

    /**
     * Método que remove a Candidatura da lista de Candidaturas
     *
     * @param c objeto do tipo Candidatura
     * @return boolean do resultado da validação
     */
    public boolean removeCandidatura(CandidaturaAExposicao c) {
        return this.listaCandidaturas.remove(c);
    }

    /**
     * Método que verifica se a candidatura já consta na lista de Candidaturas
     *
     * @param c objeto do tipo Candidatura
     * @return boolean do resultado da operação
     */
    public boolean validaCandidatura(CandidaturaAExposicao c) {
        if (listaCandidaturas.contains(c)) {
            System.out.println("Candidatura ja consiste na lista de Candidaturas");
            return false;
        } else if (c.valida()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que verifica se a lista de candidaturas está vazia ou não
     *
     * @return boolean do resultado da validação
     */
    public boolean valida() {
        if (listaCandidaturas.isEmpty()) {
            System.out.println("Lista de Candidaturaes vazia.\nEvento não registado!");
            return false;
        } else {
            return true;
        }
    }

    /**
     * Método que retorna o tamanho da lista de candidaturas(ou seja o seu
     * número de elementos)
     *
     * @return tamanho da lista de candidaturas
     */
    public int tamanho() {
        return this.listaCandidaturas.size();
    }

    /**
     * Método que permite consultar uma Candidatura da lista recebendo como
     * parâmetro a sua posição na lista
     *
     * @param index posição na lista
     * @return Candidatura pretendido
     */
    public CandidaturaAExposicao obterCandidatura(int index) {
        return listaCandidaturas.get(index);
    }

    /**
     * Método que retorna a posição da Candidatura,se este não exitir retorna -1
     *
     * @param c objeto do tipo Candidatura
     * @return posição da Candidatura
     */
    public int indiceDe(CandidaturaAExposicao c) {
        return this.listaCandidaturas.indexOf(c);
    }

    /**
     * Método que retorna um ArrayList contendo a lista de Candidaturas
     *
     * @return ArrayList
     */
    public CandidaturaAExposicao[] toArray() {
        return this.listaCandidaturas.toArray(new CandidaturaAExposicao[this.listaCandidaturas.size()]);
    }

    /**
     * Método que permite alterar a lista de Candidaturas
     *
     * @param m_listaCandidaturas objeto do tipo ArrayList
     */
    public void setListaCandidaturas(List<CandidaturaAExposicao> m_listaCandidaturas) {
        this.listaCandidaturas = m_listaCandidaturas;
    }

    /**
     * Método que retorna a informação da lista de candidaturas
     *
     * @return informação da lista de candidaturas
     */
    @Override
    public String toString() {
        String returnString = "";
        for (CandidaturaAExposicao org : this.listaCandidaturas) {
            returnString += org.toString();
        }
        return returnString;
    }
}
