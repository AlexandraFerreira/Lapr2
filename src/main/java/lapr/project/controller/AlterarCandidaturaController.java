/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.*;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public class AlterarCandidaturaController {
    
    private CentroExposicoes empresa;
    private Candidatura cand;
    private Exposicao expo;

    public AlterarCandidaturaController(CentroExposicoes empresa) {
        this.empresa = empresa;
    }

    public Candidatura getCandidatura(String strID) {
        cand = expo.getRegistoCandidaturas().getCandidatura(strID);
        return cand;
    }
    
    public boolean setDados(String nome, String morada, int telemovel, double area,
            int quantidade, ListaProdutos produtos, Demonstracao demo) {
        
        Candidatura cClone = cand.clone();
        
        cClone.setNomeEmp(nome);
        cClone.setMorada(morada);
        cClone.setTelefone(telemovel);
        cClone.setAreaPretendida(area);
        cClone.setQuatConvites(quantidade);
        cClone.setProdutos(produtos);
        cClone.setDemonstracoes(demo);
        
        return expo.getRegistoCandidaturas().alteraCandidatura(cand, cClone);
    }
}
