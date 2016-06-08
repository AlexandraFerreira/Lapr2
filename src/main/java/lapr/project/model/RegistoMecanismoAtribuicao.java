/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristiano Melo
 */
public class RegistoMecanismoAtribuicao {
    
    private List<MecanismoAtribuicao> m_listaMecanismos;

    /**
     *
     */
    public RegistoMecanismoAtribuicao() {
        this.m_listaMecanismos=new ArrayList<MecanismoAtribuicao>();
        
        implementarMecanismos();
    }
    
    /**
     *
     * @return
     */
    public List<MecanismoAtribuicao> getMecanismosDistribuicao(){
        return this.m_listaMecanismos;
    }
    
    /**
     *
     * @param lista
     */
    public void setMecanismosAtribuicao(List<MecanismoAtribuicao> lista){
        this.m_listaMecanismos=lista;
    }
    
    /**
     * Implementa os mecanismos de distribuição.
     */
    public void implementarMecanismos() {

        m_listaMecanismos.add(novoMecanismo1());
        m_listaMecanismos.add(novoMecanismo2());
        m_listaMecanismos.add(novoMecanismo3());

    }
    /**
     * Cria o mecanismo de Atribuicao 1.
     * @return novo mecanismo de distribuição 1.
     */
    public MecanismoAtribuicao novoMecanismo1() {
        return new MecanismoAtribuicao1();
    }
    /**
     * Cria o mecanismo de Atribuicao 2.
     * @return novo mecanismo de distribuição 2.
     */
    public MecanismoAtribuicao novoMecanismo2() {
        return new MecanismoAtribuicao2();
    }
    /**
     * Cria o mecanismo de Atribuicao 3.
     * @return novo mecanismo de distribuição 3.
     */
    public MecanismoAtribuicao novoMecanismo3() {
        return new MecanismoAtribuicao3();
    }
    
}
