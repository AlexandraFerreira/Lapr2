/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 * Esta classe guarda a designacao do produto.
 *
 * @author Cristiano Melo
 */
public class Produto {

    /**
     * Declaracao da variavel nome.
     */
    private String nome;
    /**
     * Declaracao da variavel nome por omissao.
     */
    private static String NOME_POR_OMISSAO = "Sem Nome";

    /**
     * Construtor completo que inicia o Produto com todos os elementos da classe
     * Produto.
     *
     * @param nome
     */
    public Produto(String nome) {
        this.nome = nome;
    }

    /**
     * Construtor vazio que inicia o Produto sem parametros.
     */
    public Produto() {
        this.nome = NOME_POR_OMISSAO;
    }

    /**
     * Metodo getNome que retorna o nome do produto.
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *Metodo setNome que permite alterar o nome do produto
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
