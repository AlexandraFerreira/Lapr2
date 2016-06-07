/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.io.Serializable;
import javax.swing.AbstractListModel;
import lapr.project.model.ListaProdutos;
import lapr.project.model.Produto;

/**
 *
 * @author Fábio Sousa
 */
public class ModeloListaProdutos extends AbstractListModel implements Serializable {

    private ListaProdutos listaProdutos;

    /**
     * Construtor que instancia um novo objeto do tipo ModeloListaPalavrasChave
     *
     * @param listaPalavrasChaves objeto do tipo ListaPalavrasChaves, que contém produtos-chave.
     */
    public ModeloListaProdutos(ListaProdutos listaKeys) {
        this.listaProdutos = listaKeys;
    }

    /**
     * Método que retorna o número de elementos da lista de produtos-chave.
     *
     * @return devolve o tamanho da ListaPalavrasChave listaPalavrasChave
     */
    @Override
    public int getSize() {
        return this.listaProdutos.tamanho();
    }

    /**
     * Método que retorna um elemento da lista de Produto numa determinada posição
     *
     * @param indice - inteiro que corresponde à posição da lista em que está o
     * elemento a retornar
     * @return devolve o elemento contido no indice passado por parâmetro
     */
    @Override
    public Object getElementAt(int indice) {
        return this.listaProdutos.obterProduto(indice);
    }

    /**
     * Método que adiciona uma sessão temática recebida por parâmetro à lista de
     * produtos, retornando true se foi adicionada com sucesso, ou false se não
     * foi possível adicionar
     *
     * @param produto - objeto da classe Produto a adicionar à lista
     * @return true/false
     */
    public boolean addElement(Produto produto) {
        boolean stAdicionada = this.listaProdutos.addProduto(produto);
        if (stAdicionada) {
            fireIntervalAdded(produto, this.getSize() - 1, this.getSize() - 1);
        }
        return stAdicionada;
    }

    /**
     * Método que remove uma sessão temática recebida por parâmetro à lista de
     * produtos, retornando true se foi removida com sucesso, ou false se não foi
     * possível a sua remoção
     *
     * @param produto - objeto da classe Produto a remover da lista
     * @return true/false
     */
    public boolean removeElement(Produto produto) {
        int indice = this.listaProdutos.indiceDe(produto);
        boolean stRemovida = this.listaProdutos.removeProduct(produto);
        if (stRemovida) {
            fireIntervalRemoved(this, indice, indice);
        }
        return stRemovida;
    }

    /**
     * Método que permite averiguar se a produto recebida por parâmetro
     * consta ou não na lista, retornando true se consta ou false se não.
     *
     * @param produto - produto a confirmar se contém ou não
     * @return true/false
     *
     */
    public boolean contains(Produto produto) {
        return this.listaProdutos.contem(produto);
    }

  
    /**
     * Método que permite atualizar a lista de produtos aquando de uma alteração
     * do seu código
     *
     */
    public void refresh() {
        fireContentsChanged(this, 0, listaProdutos.tamanho() - 1);
    }

    public ListaProdutos getListaProdutos(){
        return this.listaProdutos;
    }

}

