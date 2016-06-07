/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.AbstractListModel;
import lapr.project.model.ListaOrganizadores;
import lapr.project.model.Organizador;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public class ModeloListaOrganizadores extends AbstractListModel {

    private ListaOrganizadores listaOrganizadores;

    public ModeloListaOrganizadores(ListaOrganizadores lista) {
        this.listaOrganizadores = lista;
    }

    @Override
    public int getSize() {
        return this.listaOrganizadores.tamanho();

    }

    @Override
    public Object getElementAt(int index) {
        return this.listaOrganizadores.obterOrganizador(index);
    }

    public boolean addElement(Organizador o) {
        boolean adicionado = this.listaOrganizadores.addOrganizador(o);
        if (adicionado) {
            fireIntervalAdded(o, this.getSize() - 1, this.getSize() - 1);
        }
        return adicionado;
    }

    public boolean removeElement(Organizador o) {
        int indice = this.listaOrganizadores.indiceDe(o);
        boolean removido = this.listaOrganizadores.removeOrganizador(o);
        if (removido) {
            fireIntervalRemoved(o, indice, indice);
        }
        return removido;
    }

    public ListaOrganizadores getListaOrganizadores() {
        return this.listaOrganizadores;
    }
}
