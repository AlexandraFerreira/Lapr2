/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.state;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public interface State {

    public abstract boolean valida();

    public abstract boolean isInCriado();

    public abstract boolean isInRegistado();

    public abstract boolean isInFAEDefinida();

    public abstract boolean isInEmSubmissao();

    public abstract boolean isInEmDetecaoConflitos();

    public abstract boolean isInEmDistribuicao();

    public abstract boolean isInEmAvaliacao();

    public abstract boolean isInEmDecisao();

    public abstract boolean isInEmDecidido();

    public abstract boolean isInCameraReady();

    public abstract boolean setStateCriado();

    public abstract boolean setStateRegistado();

    public abstract boolean setStateFAEDefinida();

    public abstract boolean setStateEmSubmissao();

    public abstract boolean setStateEmDetecaoConflitos();

    public abstract boolean setStateEmDistribuicao();

    public abstract boolean setStateEmAvaliacao();

    public abstract boolean setStateEmDecisao();

    public abstract boolean setStateEmDecidido();

    public abstract boolean setStateCameraReady();
}
