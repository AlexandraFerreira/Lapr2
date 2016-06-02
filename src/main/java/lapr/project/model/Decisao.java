/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Classe responsável pela decisao tomada pelos FAE às candidaturas para cada
 * exposicao
 *
 * @author Miguel-PC
 */
public class Decisao {

    private Decisao d;
    private String justificacao;

    /**
     * Método que vai retornar a informação de uma decisão
     *
     * @param d do tipo Decisao - Decisao tomada pelos FAE a uma candidatura de
     * uma certa exposicao
     * @return informação da decisao (String)
     */
    public String getInfoDecisao(Decisao d) {

    }

    /**
     * Método que modifica a decisao
     *
     * @param d do tipo Decisao (decisao tomada pelos FAE a uma candidatura)
     */
    public void setDecisao(Decisao d) {
        this.d = d;
    }

    /**
     * Método que modifica a justificação dada pelo FAE para uma decisao
     *
     * @param justificacao do tipo String (justificação dada pelo FAE para
     * decisao de candidaturas)
     */
    public void setJustificacao(String justificacao) {
        this.justificacao = justificacao;
    }

    /**
     * Método de validação
     *
     * @return
     */
    public boolean valida() {

    }

    /**
     * Método que vai adicionar uma decisão à lista de decisões
     *
     * @param d do tipo Decisao (decisao tomada pelo FAE para uma candidatura)
     * @return decisao fica guardada na lista de decisões
     */
    public boolean add(Decisao d) {

    }
}
