/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.*;

/**
 * A Classe DecidirCandidaturasController controla a decisao dos FAE para as
 * candidaturas a uma determinada exposicao
 *
 * @author Miguel-PC
 */
public class DecidirCandidaturasController {

    private List<Candidatura> m_lCandidaturas;
    private List<Exposicao> m_lExposicoes;
    private Decisao d;
    private String justificacao;

    /**
     * Método que vai retornar a lista de candidaturas a uma determinada
     * exposição
     *
     * @return a lista de candidaturas a uma determinada exposicao
     */
    public List<Candidatura> getListaCandidaturasExposicao() {
        for (Exposicao listaExposicoes : m_lExposicoes) {

        }
    }

    /**
     * Método que vai retornar a lista de candidaturas por decidir de um
     * determinado FAE
     *
     * @param fae do tipo FAE (funcionario de apoio à exposição)
     * @return lista de candidaturas por decidir de um FAE
     */
    public List<Candidatura> getListaCandidaturasPorDecidir(FAE fae) {

    }

    /**
     * Método que sempre que um FAE tomar uma decisao, vai guardar no sistema a
     * decisao (se candidatura é aceite ou não) e a respectiva justificação para
     * tal decisao
     *
     * @param d do tipo Decisao - Decisao tomada pelo FAE à candidatura a uma
     * exposicao lhe atribuida
     * @param justificacao do tipo String - Texto justificativo apresentando o
     * porquê de tal decisao para cada candidatura a uma exposicao
     */
    public void setDecisao(Decisao d, String justificacao) {
        this.d = d;
        this.justificacao = justificacao;
    }

    /**
     * Método que vai fazer o registo da decisao tomada pelo FAE a uma
     * determinada candidatura lhe atribuida
     *
     * @return registo da decisao (decisao fica guardada no sistema)
     */
    public Decisao registaDecisao() {

    }

    /**
     * Método que retorna a informacao da candidatura ainda por decidir pelo FAE
     *
     * @param fae do tipo FAE (funcionario de apoio à exposição)
     * @return informação da candidatura por decidir
     */
    public String getInformacaoCandidaturaPorDecidir(FAE fae) {

    }
}
