/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.AbstractListModel;
import lapr.project.model.*;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public class ModeloListaUtilizadores extends AbstractListModel {

    private RegistoUtilizadores listaUtilizadores;

    public ModeloListaUtilizadores(RegistoUtilizadores lista) {
        this.listaUtilizadores = lista;
    }

    @Override
    public int getSize() {
        return this.listaUtilizadores.tamanho();
    }

    @Override
    public Object getElementAt(int index) {
        return this.listaUtilizadores.obterUtilizador(index);
    }

    public boolean addElement(Utilizador u) {
        boolean adicionado = this.listaUtilizadores.addUtilizador(u);
        if (adicionado) {
            fireIntervalAdded(u, this.getSize() - 1, this.getSize() - 1);
        }
        return adicionado;
    }

    public boolean removeElement(Utilizador u) {
        int indice = this.listaUtilizadores.indiceDe(u);
        boolean removido = this.listaUtilizadores.removerUtilizador(u);
        if (removido) {
            fireIntervalRemoved(u, indice, indice);
        }
        return removido;
    }
}
