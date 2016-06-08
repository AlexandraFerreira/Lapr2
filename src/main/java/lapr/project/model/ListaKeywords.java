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
public class ListaKeywords {

    /**
     * A lista de Keywords.
     */
    private List<Keyword> listapalavrasChave;

    /**
     * Constrói uma instância de ListaKeywords com todos os valores "vazios".
     */
    public ListaKeywords() {
        this.listapalavrasChave = new ArrayList<>();
    }

    /**
     * Devolve a lista de palavras chave.
     *
     * @return a lista de palavras chave.
     */
    public List<Keyword> getPalavrasChave() {
        return this.listapalavrasChave;
    }

    /**
     * Método que permite alterar a lista de Keywords.
     *
     * @param listkeyWords a nova lista de Keywords
     */
    public void setPalavrasChave(List<Keyword> listkeyWords) {
        this.listapalavrasChave = listkeyWords;
    }

    /**
     * Método que retorna o tamanho da lista de keywords (ou seja o seu número
     * de elementos)
     *
     * @return tamanho da lista de keywords
     */
    public int tamanho() {
        return this.listapalavrasChave.size();
    }

    /**
     * Método que permite consultar uma Keyword da lista recebendo como
     * parâmetro a sua posição na lista
     *
     * @param indice posição na lista
     * @return Keyword pretendida
     */
    public Keyword obterPalavra(int indice) {
        return this.listapalavrasChave.get(indice);
    }

    /**
     * Método que retorna a posição da Keyword, se esta não exitir retorna -1
     *
     * @param k objeto do tipo Keyword
     * @return posição da Keyword
     */
    public int indiceDe(Keyword k) {
        return this.listapalavrasChave.indexOf(k);
    }

    /**
     * Método que verifica se a lista de Palavras Chaves contém uma determinada chave.
     *
     * @param str a keyword a verificar
     * @return true caso contenha, caso contrário devolve false.
     */
    public boolean contains(Keyword str) {
        return this.listapalavrasChave.contains(str);
    }

    /**
     * Método que adiciona a Keyword à lista de Keywords
     *
     * @param palavra objeto do tipo Keyword
     *
     * @return boolean do resultado da validação
     */
    public boolean adicionarPalavraChave(Keyword palavra) {
        if (valida(palavra)) {
            if (validaRepetidaPalavraChave(palavra) == true) {
                return this.listapalavrasChave.add(palavra);
            }
        }
        return false;
    }

     /**
     * Método que percorre a lista de palavras chave e verifica se esta já se 
     * encontra na lista
     *
     * @param palavra a palavra chave a procurar
     * @return false caso já exista caso contrário retorne true
     */
    public boolean validaRepetidaPalavraChave(Keyword palavra) {

        for (Keyword p : listapalavrasChave) {
            if (p.equals(palavra)) {
                return false;
            }
        }
        return true;
    }

    /**
     * validacao local da palavra através de uma regex
     *
     * @param palavra palavra
     * @return true caso seja valida, caso contrário devolve flase
     */
    public boolean valida(Keyword palavra) {
        String uPattern = "^^[a-zA-Z0-9ãâáàéèêõôóòíìîúùû -]+$";
        java.util.regex.Pattern r = java.util.regex.Pattern.compile(uPattern);
        java.util.regex.Matcher n = r.matcher(palavra.getValue());

        return n.matches();

    }

    /**
     * Método que remove a Keyword da lista de palavras chaves.
     *
     * @param palavra a palavra chave a remover
     * @return true caso seja possivel, caso contrário devolve false
     */
    public boolean removerPalavraChave(Keyword palavra) {
        return this.listapalavrasChave.remove(palavra);
    }

}
