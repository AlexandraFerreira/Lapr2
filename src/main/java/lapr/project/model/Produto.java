/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.Objects;

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
     * @param nome o nome do Produto
     */
    public Produto(String nome) {
        setNome(nome);
    }

    /**
     * Construtor vazio que inicia o Produto sem parametros.
     */
    public Produto() {
        this.nome = NOME_POR_OMISSAO;
    }

    /**
     * Metodo getNome que retorna o nome do produto.
     *
     * @return o nome do Produto
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo setNome que permite alterar o nome do produto
     *
     * @param nome o nome do Produto
     */
    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("ERRO: Nome do produto é inválido!");
        }
        this.nome = nome;
    }
    
    /**
     * Validação de um produto.
     *
     * @return true se o objeto for válido. Caso contrário, retorna false.
     */
    public boolean valida() {
        System.out.println("Produto em validação: " + this.toString());
        return validaNome(nome);
    }

    private boolean validaNome(String nome) {
        if (nome == null || nome.trim().isEmpty() || nome.matches(".*\\d+.*")) {
            throw new IllegalArgumentException("ERRO: Nome de produto inválido!");
        }
        return true;
    }

    /**
     * Devolve a descrição textual do Produto.
     *
     * @return caraterísticas do Produto.
     */
    @Override
    public String toString() {
        return "Produto: nome: " + nome + ".";
    }

    /**
     * Verifica se uma instancia de Produto é igual à outra.
     *
     * @param obj o objeto a comparar com o Produto.
     * @return true se o objeto recebido representar outro Produto equivalente
     * ao Produto. Caso contrário, retorna false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return Objects.equals(this.nome, other.nome);
    }

}
