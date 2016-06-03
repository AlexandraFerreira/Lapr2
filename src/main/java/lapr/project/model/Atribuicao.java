/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Esta classe tem como finalidade a construcao de objetos do tipo Atribuicao.
 *
 * @author Cristiano Melo
 */
public class Atribuicao {

    /**
     * Declaracao da variavel candidatura do tipo candidatura.
     */
    private Candidatura candidatura;
    /**
     * Declaracao da variavel fae do tipo FAE.
     */
    private FAE fae;

    /**
     *Construtor completo que cria a candidatura com todos os elementos da classe
     * @param candidatura
     * @param fae
     */
    public Atribuicao(Candidatura candidatura, FAE fae) {
        this.candidatura = candidatura;
        this.fae = fae;
    }

    /**
     *Construtor vazio de Atribuicao que inicia as variaveis de instancias invocando
     * os construtores vazios das classes.
     */
    public Atribuicao() {
        this.candidatura = new Candidatura();
        this.fae = new FAE();
    }

    /**
     *Metodo getCandidatura que retorna uma candidatura.
     * @return
     */
    public Candidatura getCandidatura() {
        return candidatura;
    }

    /**
     * Este set candidatura atualiza os parametros de candidatura.
     * @param candidatura
     */
    public void setCandidatura(Candidatura candidatura) {
        this.candidatura = candidatura;
    }

    /**
     * Metodo getFAE que retorna um FAE.
     * @return
     */
    public FAE getFae() {
        return fae;
    }

    /**
     *Este set fae atualiza os parametros de fae.
     * @param fae
     */
    public void setFae(FAE fae) {
        this.fae = fae;
    }

}
