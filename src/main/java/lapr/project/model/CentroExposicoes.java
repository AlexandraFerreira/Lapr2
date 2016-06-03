/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import lapr.project.model.ListaDemonstracoes;

/**
 * Esta classe é responsável por guardar e gerir todas as funcionalidades da
 * aplicação, uma vez que é a classe que representa a empresa.
 *
 * @author Fábio Sousa
 */
public class CentroExposicoes {

    /**
     * Registo de exposições da empresa.
     */
    private RegistoExposicoes m_registaExposicao;

    /**
     * Lista de demonstrações onde se encontram as demonstrações possíveis
     */
    List<Exposicao> m_lListaExposicoes;
    /**
     * Registo de utilizadores da empresa.
     */
    private RegistoUtilizadores m_registoUtilizador;

    /**
     * Constrói uma instância de Centro de Exposições com dados de teste.
     */
    public CentroExposicoes() {
        this.m_registaExposicao = new RegistoExposicoes();
        this.m_registoUtilizador = new RegistoUtilizadores();

    }

    /**
     * Devolve o Registo de Exposições.
     *
     * @return Registo de Exposições.
     */
    public RegistoExposicoes getRegistoExposicoes() {
        return m_registaExposicao;
    }

    /**
     * Devolve o Registo de Utilizadores.
     *
     * @return Registo de Utilizadores.
     */
    public RegistoUtilizadores getRegistoUtilizadores() {
        return m_registoUtilizador;
    }

    /**
     * Método que devolve uma exposição da lista
     *
     * @return uma exposição
     */
    public Exposicao getExposicoes() {
        Exposicao e = new Exposicao();
        return e;
    }

    /**
     * Método que guarda a Candidatura;
     *
     * @param c recebe a candidatura e guarda na lista de exposições
     */
//    public void guardarCandidatura(Candidatura c) {
//        setRegisoExposicoes(c);
//    }
    /**
     * @return the m_registaExposicao
     */
    public List<Exposicao> getM_registaExposicao() {
        return m_lListaExposicoes;
    }

    /**
     * @param m_registaExposicao the m_registaExposicao to set
     */
//    public void setM_registaExposicao(List<Exposicao> m_registaExposicao) {
//        this.m_registaExposicao = m_registaExposicao;
//    }
}
