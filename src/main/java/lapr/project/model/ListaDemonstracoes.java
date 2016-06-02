/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;
import lapr.project.model.Demonstracao;
/**
 *
 * @author Fábio Sousa
 */
public class ListaDemonstracoes {
    /**
     * A lista de demonstrações.
     */
    List<Demonstracao> m_lDemonstracao;
    
    /**
     * Constrói uma instância de ListaDemontrações com todos os valores "vazios".
     */
    public ListaDemonstracoes() {
        this.m_lDemonstracao = new ArrayList<>();
    }

    /**
     * Método que adiciona uma demonstração recebido por parâmetro caso este seja válido.
     *
     * @param d demonstração a adicionar
     */
    public void addDemonstracao(Demonstracao d){
        Demonstracao demonstracao = new Demonstracao();
        if(validaDemonstracao(demonstracao)){
           add(demonstracao);
        }
    }
    
    /**
     * Método que verifica se a demonstração é válida.
     * 
     * @param d a demonstracao a validar
     * @return true caso seja válido, caso contrário devolve false.
     */
    public boolean validaDemonstracao(Demonstracao d){
        if (d.valida(d)) {
            return true;
        }
        return false;
    }
    
    /**
     * Método que verifica se a lista de demonstrações é válida.
     * 
     * @param d demonstração a validar
     * @return true caso seja válido, caso contrário devolve false.
     */
    public boolean valida(ListaDemonstracoes d){
        for(Demonstracao de : this.m_lDemonstracao){
            if (de.valida(de)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que adiciona a demonstração passado por parâmetro à lista de organizadores.
     * 
     * @param d a demonstração a validar
     * @return true caso seja válido, caso contrário devolve false.
     */
    boolean add(Demonstracao d) {
       return this.m_lDemonstracao.add(d);
    }
    
}
