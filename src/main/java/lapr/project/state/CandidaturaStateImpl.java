/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.state;

import lapr.project.model.CandidaturaAExposicao;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public abstract class CandidaturaStateImpl implements State {

    private CandidaturaAExposicao cand;

    public CandidaturaStateImpl(CandidaturaAExposicao candExpo) {
        cand = candExpo;
    }

    public CandidaturaAExposicao getCandidatura() {
        return this.cand;
    }

    @Override
    public boolean isInCriado() {
        return false;
    }

    @Override
    public boolean isInRegistado() {
        return false;
    }

    @Override
    public boolean isInFAEDefinida() {
        return false;
    }

    @Override
    public boolean isInEmSubmissao() {
        return false;
    }

    @Override
    public boolean isInEmDetecaoConflitos() {
        return false;
    }

    @Override
    public boolean isInEmDistribuicao() {
        return false;
    }

    @Override
    public boolean isInEmAvaliacao() {
        return false;
    }

    @Override
    public boolean isInEmDecisao() {
        return false;
    }

    @Override
    public boolean isInEmDecidido() {
        return false;
    }

    @Override
    public boolean isInCameraReady() {
        return false;
    }

    @Override
    public boolean setStateRegistado() {
        return false;
    }
    
    @Override
    public boolean setStateFAEDefinida() {
        return false;
    }

    @Override
    public boolean setStateEmSubmissao() {
        return false;
    }

    @Override
    public boolean setStateEmDetecaoConflitos() {
        return false;
    }

    @Override
    public boolean setStateEmDistribuicao() {
        return false;
    }

    @Override
    public boolean setStateEmAvaliacao() {
        return false;
    }

    @Override
    public boolean setStateEmDecisao() {
        return false;
    }

    @Override
    public boolean setStateEmDecidido() {
        return false;
    }

    @Override
    public boolean setStateCameraReady() {
        return false;
    }

}
