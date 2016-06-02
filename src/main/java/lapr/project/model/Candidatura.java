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
public class Candidatura {
    /**
     * Declaracao da variavel com  area Pretendida.
     */
    private double areaPretendida;
    /**
     *  Declaracao da variavel com a quantidade de convites.
     */
    private int quatConvites;
    /**
     *  Declaracao da variavel com o nome da empresa.
     */
    private String nomeEmp;
    /**
     *  Declaracao da variavel com a morada.
     */
    private String morada;
    /**
     *  Declaracao da variavel com o telefone.
     */ 
    private int telefone;
    
    private Produto produto;
    
    
    /**
     * Construtor completo que inicia a Candidatura com todos os elementos da classe
     * Candidatura.
     * @param areaPretendida variavel que indica a area pretendida.
     * @param quantConvites variavel que indica a quantidade de convites.
     * @param nomeEmp variavel que indica o nome da empresa.
     * @param morada variavel que indica a morada da empresa.
     * @param telefone variavel que indica telemovel da empresa.
     */
    public Candidatura(double areaPretendida, int quantConvites, String nomeEmp, String morada, int telefone){
        this.areaPretendida=areaPretendida;
        this.quatConvites=quantConvites;
        this.nomeEmp=nomeEmp;
        this.morada=morada;
        this.telefone=telefone;
       
        
    }
          
    
    
    
}
