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
    private List<Exposicao> m_registaExposicao;

    /**
     * Construtor vazio que cria uma instância de lista de exposições nova
     */
    public CentroExposicoes() {
        List<Exposicao> listaExposicao = new ArrayList<>();
    }

    /**
     * Método que permite ir buscar a lista de exposicoes
     *
     * @return m_registaExposicoes - lista de exposições
     */
    public List<Exposicao> buscarListaExposicoes() {
        return m_registaExposicao;
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
    public List<Object> buscarListaDemonstracoes() {
        List<Object> a = new ArrayList<>();
        return a;
    }
}
