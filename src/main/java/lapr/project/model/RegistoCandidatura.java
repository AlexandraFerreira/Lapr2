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
 * @author Fábio Sousa
 */
public class RegistoCandidatura {

    /**
     * Lista de Candidaturas do sistema
     */
    List<CandidaturaAExposicao> listaCandidaturas;

    /**
     * Constrói uma instância de RegistoCandidatura sem parâmetros.
     */
    public RegistoCandidatura() {
        listaCandidaturas = new ArrayList<>();
    }

    /**
     * Método que cria uma nova candidatura sem parâmetros, mais tarde se faz os
     * set para adicionar os novos atributos da candidatura
     *
     * @return
     */
    public CandidaturaAExposicao criarCandidatura() {
        return new CandidaturaAExposicao();
    }

    /**
     * Método que valida a candidatura
     *
     * @return true or false de acordo consoante a validação da candidatura
     */
    public boolean validaCandidatura(CandidaturaAExposicao c) {
        if (c.valida()) {
            return true;
        }
        return false;
    }

    /**
     * Método que regista a candidatura após tudo verificado
     */
    public boolean registaCandidatura(CandidaturaAExposicao c) {
        return validaCandidatura(c);
    }

    /**
     * Procura uma candidatura na lista de candidaturas através dos seus
     * identificadores (nome da empresa).
     *
     * @param id o ID da candidatura
     * @return Um objeto do tipo candidatura, caso o mesmo exista, caso
     * contrário devolve null.
     */
    public CandidaturaAExposicao getCandidatura(String id) {
        for (CandidaturaAExposicao cand : this.listaCandidaturas) {
            if (cand.getNomeEmp().equals(id)) {
                return cand;
            }
        }

        return null;
    }

    public boolean alteraCandidatura(CandidaturaAExposicao cOriginal, CandidaturaAExposicao cClone) {
        if (cClone.valida()) {
            List<CandidaturaAExposicao> lstCandidaturas = new ArrayList<CandidaturaAExposicao>(listaCandidaturas);
            lstCandidaturas.remove(cOriginal);
            lstCandidaturas.add(cClone);

            if (validaLista(lstCandidaturas)) {

                cOriginal.setNomeEmp(cClone.getNomeEmp());
                cOriginal.setMorada(cClone.getMorada());
                cOriginal.setTelefone(cClone.getTelefone());
                cOriginal.setAreaPretendida(cClone.getAreaPretendida());

                return true;
            }
        }
        return false;
    }

    private boolean validaLista(List<CandidaturaAExposicao> lista) {
        System.out.println("RegistoCandidatura: validaLista: " + lista.toString());
        return true;
    }
}
