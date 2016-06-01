/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Cristiano Melo
 */
public class FAE extends Utilizador {

    /**
     * Declaracao da variavel exposicao.
     */
    private Exposicao exposicao;

    /**
     * Construtor completo que inicia o FAE com todos os elementos da classe
     * FAE.
     *
     * @param exposicao variavel de instancia exposicao que indica a exposicao
     * do FAE.
     * @param nome variavel que indica o nome do Utilizador FAE.
     * @param email variavel que indica o email do Utilizador FAE.
     * @param username variavel que indica o username do Utilizador FAE.
     * @param password variavel que indica a password do Utilizador FAE.
     */
    public FAE(Exposicao exposicao, String nome, String email, String username, String password) {
        super(nome, email, username, password);
        this.exposicao = exposicao;
    }

    /**
     * Construtor vazio de FAE que inicia as variaveis de instancias invocando
     * os construtores vazios das classes.
     */
    public FAE() {
        super();
        exposicao = new Exposicao();
    }

    /**
     * Este set exposicao atualiza a exposicao do FAE.
     *
     * @param exposicao
     */
    public void setExposicao(Exposicao exposicao) {
        this.exposicao = exposicao;
    }

    /**
     * Getter retorna a exposicao atual do FAE.
     *
     * @return a exposicao em que o FAE está inserido.
     */
    public Exposicao getExposicao() {
        return exposicao;
    }
/**
 * Retorna a descricao do FAE.
 * @return 
 */
    @Override
    public String toString() {
        return "FAE{" + "Nome=" + super.getNome() + " Email=" + super.getEmail() + " Username=" + super.getUsername() + " Exposicao=" + exposicao + '}';
    }

}
