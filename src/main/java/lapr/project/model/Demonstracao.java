/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

/**
 *
 * @author Fábio Sousa
 */
public class Demonstracao {
    private String descricao;
    private String codigoUnico;

    /**
     * Construtor com todos os parâmetros de demonstração
     * @param codigoUnico Código unico da demonstração
     * @param descricao Descrição da demonstração
     */
    public Demonstracao(String codigoUnico, String descricao) {
        this.codigoUnico = codigoUnico;
        this.descricao = descricao;
    }

    /**
     * Construtor sem parâmetros de Demonstração
     */
    public Demonstracao() {
    }

    /**
     * Método que retorna o código único da demonstração
     * @return Código único da demonstração
     */
    public String getCodigoUnico() {
        return codigoUnico;
    }

    /**
     * Método que modifica o código única da demonstração
     * @param codigoUnico Código único da demonstração
     */
    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    /**
     * Método que modifica a descrição da demonstração
     * @param novaDescricao Descrição da demonstração
     */
    public void setDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }

    /**
     * Método que retorna a descrição da demonstração
     * @return Descrição da demonstração
     */
    public String getDescricao() {
        return descricao;
    }
    public boolean valida(Demonstracao d){
        return true;
    }

    /**
     * Método que retorna o texto descritivo da demonstração
     * @return A informação da demonstração
     */
    @Override
    public String toString() {
        return "Descrição: " + this.getDescricao() + " \nCódigo Único: " + this.getCodigoUnico() + "\n";
    }
}

