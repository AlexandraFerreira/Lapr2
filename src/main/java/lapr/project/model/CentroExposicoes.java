/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import java.lang.Object;

/**
 *
 * @author Fábio Sousa
 */
public class CentroExposicoes {

    /**
     * variável lista de exposicões
     */
    private RegistoExposicoes m_registaExposicao;
    
    private RegistoUtilizadores m_registoUtilizador;

    /**
     * Construtor vazio que cria uma instância de lista de exposições nova
     */
    public CentroExposicoes() {
        this.m_registaExposicao = new RegistoExposicoes();
        this.m_registoUtilizador = new RegistoUtilizadores();
    }

    public RegistoExposicoes getRegistoExposicoes(){
        return m_registaExposicao; 
    }
    
    public RegistoUtilizadores getRegistoUtilizadores(){
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
    public void guardarCandidatura(Candidatura c) {
        setRegisoExposicoes(c);
    }

    /**
     * Métod que permite devolver a lista de demonstracoes
     *
     * @return a lista de demonstrações
     */
    public List<Object> getListaDemonstracoes() {
        List<Object> a = new ArrayList<>();
        return a;
    }

    /**
     * @return the m_registaExposicao
     */
    public List<Exposicao> getM_registaExposicao() {
        return m_registaExposicao;
    }

    /**
     * @param m_registaExposicao the m_registaExposicao to set
     */
    public void setM_registaExposicao(List<Exposicao> m_registaExposicao) {
        this.m_registaExposicao = m_registaExposicao;
    }
}
