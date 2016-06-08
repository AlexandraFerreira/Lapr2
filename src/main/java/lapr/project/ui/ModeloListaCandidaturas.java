/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.AbstractListModel;
import lapr.project.model.ListaCandidaturas;
import lapr.project.model.CandidaturaAExposicao;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public class ModeloListaCandidaturas extends AbstractListModel {

    private ListaCandidaturas listaCandidaturas;

    public ModeloListaCandidaturas(ListaCandidaturas lista) {
        this.listaCandidaturas = lista;
    }

    @Override
    public int getSize() {
        return this.listaCandidaturas.tamanho();

    }

    @Override
    public Object getElementAt(int index) {
        return this.listaCandidaturas.obterCandidatura(index);
    }

    public boolean addElement(CandidaturaAExposicao c) {
        boolean adicionado = this.listaCandidaturas.addCandidatura(c);
        if (adicionado) {
            fireIntervalAdded(c, this.getSize() - 1, this.getSize() - 1);
        }
        return adicionado;
    }

    public boolean removeElement(CandidaturaAExposicao c) {
        int indice = this.listaCandidaturas.indiceDe(c);
        boolean removido = this.listaCandidaturas.removeCandidatura(c);
        if (removido) {
            fireIntervalRemoved(c, indice, indice);
        }
        return removido;
    }

    public ListaCandidaturas getListaCandidaturas() {
        return this.listaCandidaturas;
    }
}
