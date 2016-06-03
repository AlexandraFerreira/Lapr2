/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import java.util.List;
import lapr.project.model.Candidatura;
import lapr.project.model.Exposicao;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.ListaProdutos;
import lapr.project.model.RegistoCandidatura;

/**
 *
 * @author Fábio Sousa
 */
public class RegistarCandidaturaController {

    /**
     * Variável que cria uma instância de CentroExposicoes
     */
    private CentroExposicoes ce;
    private RegistoCandidatura rcandidatura;
    private Candidatura c;
    
    public RegistarCandidaturaController(CentroExposicoes ce) {
        this.ce = ce;
    }
    
    public void addProduto(String designacao){
        c.getProdutos().addProduto(designacao);
    }
    /**
     * Método que retorna a lista de exposições
     *
     * @return lista de exposições
     */
    public List<Exposicao> getListaExposicoes() {
        return ce.getM_registaExposicao();
    }

    /**
     * Método que retorna uma exposição para registar candidaturas
     *
     * @return Exposição
     */
    public Exposicao getExposicoes() {
        return ce.getExposicoes();
    }

    /**
     * Método que cria uma candidatura apartir da classe registoCandidatura
     *
     * @return
     */
    public Candidatura criarCandidatura() {
        c = rcandidatura.criarCandidatura();
        return c;
    }

    /**
     * Método que insere os dados na candidatura criada para esta exposição
     *
     * @param nomeEmp
     * @param morada
     * @param telefone ou contato
     * @param areaPretendida
     * @param quantConvites
     * @return
     */
    public Candidatura insereDados(String nomeEmp, String morada, int telefone, double areaPretendida, ListaProdutos lp, int quantConvites) {
        c.setNomeEmp(nomeEmp);
        c.setMorada(morada);
        c.setTelefone(telefone);
        c.setProdutos(lp);
        c.setQuatConvites(quantConvites);
        return c;
    }

}
