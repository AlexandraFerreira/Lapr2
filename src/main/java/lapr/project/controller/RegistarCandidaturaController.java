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
import lapr.project.model.Demonstracao;
import lapr.project.model.ListaDemonstracoes;
import lapr.project.model.ListaProdutos;
import lapr.project.model.Produto;
import lapr.project.model.RegistoCandidatura;

/**
 *
 * @author Fábio Sousa
 */
public class RegistarCandidaturaController {

    /**
     * Variável que cria uma instância de CentroExposicoes.
     */
    private CentroExposicoes ce;
    /**
     * Variável que cria uma instância de RegistoCandidatura.
     */
    private RegistoCandidatura rcandidatura;
    /**
     * Variável que cria uma instância de Candidatura.
     */
    private Candidatura c;

    /**
     * Construtor com o parâmetro centro de exposições.
     *
     * @param ce
     */
    public RegistarCandidaturaController(CentroExposicoes ce) {
        this.ce = ce;
    }

    public void addProduto(Produto produto) {
        c.getProdutos().addProduto(produto);
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

    /**
     * Métodoq que retorna a lista de demonstrações.
     *
     * @return lista de demonstrções.
     */
    public ListaDemonstracoes getListaDemonstracao() {
        Exposicao e = ce.getExposicoes();
        return e.getListaDemonstracoes();
    }

    /**
     * Método que permite guardar uma demonstração na lista de demonstrações
     * numa candidatura
     *
     * @param d
     */
    public void guardarDemonstracao(Demonstracao d) {
        c.guardarDemonstracao(d);
    }
    /**
     * Método que regista a candidatura.
     * @param rcandidatura 
     */
    public boolean registaCandidatura(Candidatura c){
        return rcandidatura.registaCandidatura(c);
    }
    
}
