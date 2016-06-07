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
 * @author AlexandraFerreira 1140388
 */
public class ListaProdutos {

    /**
     * A lista de Produtos.
     */
    private List<Produto> listaProdutos;

    /**
     * Constrói uma instância de ListaProdutos com todos os valores "vazios".
     */
    public ListaProdutos() {
        this.listaProdutos = new ArrayList<>();
    }

    /**
     * Método que adiciona o produto recebido por parâmetro caso este seja
     * válido.
     *
     * @param p o produto a adicionar
     */
    public boolean addProduto(Produto prod) {
        
        if (validaProduto(prod)) {
            return add(prod);
        }
        return false;
    }

    /**
     * Método que verifica se o produto é válido.
     *
     * @param p o produto a validar
     * @return true caso seja válido, caso contrário devolve false.
     */
    public boolean validaProduto(Produto p) {
        if (p.valida()) {
            return true;
        }
        return false;
    }

    /**
     * Método que verifica se a lista de produtos é válida.
     *
     * @param lp o produto a validar
     * @return true caso seja válido, caso contrário devolve false.
     */
    public boolean valida(ListaProdutos lp) {
        for (Produto prod : this.getListaProdutos()) {
            if (prod.valida()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que adiciona o produto passado por parâmetro à lista de
     * produtos.
     *
     * @param p o produto a validar
     * @return true caso seja válido, caso contrário devolve false.
     */
    boolean add(Produto p) {
        return this.getListaProdutos().add(p);
    }

    /**
     * @return the listaProdutos
     */
    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    /**
     * @param listaProdutos the listaProdutos to set
     */
    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public int tamanho() {
        return this.listaProdutos.size();
    }

    public Produto obterProduto(int indice) {
        return this.getListaProdutos().get(indice);
    }

    public int indiceDe(Produto produto) {
       return this.getListaProdutos().indexOf(produto);
    }

    public boolean removeProduct(Produto produto) {
        return this.getListaProdutos().remove(produto);
    }

    public boolean contem(Produto produto) {
        return this.getListaProdutos().contains(produto);
    }

}
