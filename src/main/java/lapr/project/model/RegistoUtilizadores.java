    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta classe trata do registo dos utilizadores.
 * 
 * @author AlexandraFerreira 1140388
 */
public class RegistoUtilizadores {
    
    /**
     * Lista de Utilizadores do sistema
     */
    List<Utilizador> listaUtilizadores;
  
    /**
     * Constrói uma instância de RegistoUtilizadores sem parâmetros.
     */
    public RegistoUtilizadores(){
        listaUtilizadores = new ArrayList<>();
    }
    
    /**
     * Procura um utilizador na lista de utilizadores através dos seus
     * identificadores (username ou email).
     *
     * @param id ID do utilizador, pode ser o seu utilizador ou email
     * @return Um objeto do tipo utilizador, caso o mesmo exista, senão retorna
     * null.
     */
    public Utilizador getUtilizador(String id) {
        for (Utilizador utilizador : this.listaUtilizadores) {
            if (utilizador.getEmail().equals(id)
                    || utilizador.getUsername().equals(id)) {
                return utilizador;
            }
        }

        return null;
    }
    
    public boolean alteraUtilizador(Utilizador uOriginal, Utilizador uClone) {
        if (uClone.valida()) {
            List<Utilizador> lstUtilizadores = new ArrayList<Utilizador>(listaUtilizadores);
            lstUtilizadores.remove(uOriginal);
            lstUtilizadores.add(uClone);
            
            if (validaLista(lstUtilizadores)) {
                
                uOriginal.setNome(uClone.getNome());
                uOriginal.setEmail(uClone.getEmail());
                uOriginal.setUsername(uClone.getUsername());
                uOriginal.setPassword(uClone.getPassword());
                
                return true;
            }
        }
        return false;
    }
    
    /**
     * Valida Lista Utilizadores
     *
     * @param lista lista Utilizadores
     * @return boolean com resultado da operação
     */
    private boolean validaLista(List<Utilizador> lista) {
        return !lista.isEmpty();
    }
    
    public List<Utilizador> getListaUtilizadores() {
        return this.listaUtilizadores;
    }
    
    /**
     * Modifica a lista de Utilizadores
     *
     * @param list a lista de utilizadores
     */
    public void setListaUtilizadores(List<Utilizador> list) {
        this.listaUtilizadores = list;
    }

//    /**
//     * Registo Utilizadores copia
//     *
//     * @param rU registo utilizadores
//     */
//    public RegistoUtilizadores(RegistoUtilizadores rU) {
//        this.m_listaUtilizadores = rU.getListaUtilizadores();
//    }

    

    /**
     * Método que permite criar um novo Utilizador
     *
     * @return utilizador criado
     */
    public Utilizador novoUtilizador() {
        return new Utilizador();
    }

    /**
     * Método que recebe um objeto do tipo Utilizador como parâmetro que depois
     * de validado o adiciona á lista de utilizadores
     *
     * @param u objeto do tipo Utilizador
     * @return boolean utilizador adicionado ou não
     */
    public boolean registaUtilizador(Utilizador u) {
        if (u.valida() && validaUtilizador(u)) {
            return addUtilizador(u);
        } else {
            return false;
        }
    }

    /**
     * Método que recebe um objeto do tipo Utilizador como parâmetro e valida-o
     *
     * @param u objeto do tipo Utilizador
     * @return boolean com resultado da operação
     */
    private boolean validaUtilizador(Utilizador u) {
        return valida(u.getUsername(), u.getEmail());

    }
    
    /**
     * Valida Username e email
     *
     * @param userName username a validar
     * @param email email a validar
     * @return boolean com resultado da operação
     */
    private boolean valida(String userName, String email) {
        for (Utilizador u : listaUtilizadores) {
            if (userName.equals(u.getUsername())) {
                System.out.println("UserName já se encontra em Utilização");
                return false;
            }
            if (email.equals(u.getEmail())) {
                System.out.println("Email já se encontra em Utilização");
                return false;
            }
        }
        return true;
    }

    /**
     * Método que recebe um objeto do tipo Utilizador e que o adiciona á lista
     * de utilizadores
     *
     * @param u objeto do tipo Utilizador
     * @return lista de utilizadores com o novo utilizador adicionado
     */
    public boolean addUtilizador(Utilizador u) {
        boolean foiAdicionado = listaUtilizadores.add(u);
        return foiAdicionado;
    }

    /**
     * Remover Utilizador
     *
     * @param u utilizador a remover
     * @return boolean com resultado da operação
     */
    public boolean removerUtilizador(Utilizador u) {
        return this.listaUtilizadores.remove(u);
    }
    
    /**
     * Tamanho da lista de utilizadores
     *
     * @return int com tamanho da lista
     */
    public int tamanho() {
        return this.listaUtilizadores.size();
    }

    /**
     * Ober utilizador por indice
     *
     * @param Index indice do utilizador
     * @return utilizador pretendido
     */
    public Utilizador obterUtilizador(int Index) {
        return listaUtilizadores.get(Index);
    }

    /**
     * Indice do utilizador
     *
     * @param u utilizador
     * @return int com indice do utilizador
     */
    public int indiceDe(Utilizador u) {
        return this.listaUtilizadores.indexOf(u);
    }

    /**
     * Converter lista para array
     *
     * @return array com utilizadores
     */
    public Utilizador[] toArray() {
        return this.listaUtilizadores.toArray(new Utilizador[this.listaUtilizadores.size()]);
    }

    /**
     * Comparar Registo Utilizador
     *
     * @param outro_ru registo utilizador
     * @return boolean com resultado da comparação
     */
    public boolean equals(RegistoUtilizadores outro_ru) {
        return (this.toString().equals(outro_ru.toString()));
    }

    /**
     * Informação dos atributos do Registo Utilizadores
     *
     * @return string com informaçao do registo utilizadores
     */
    @Override
    public String toString() {
        String toString = "";
        for (Utilizador u : listaUtilizadores) {
            toString += u.toString() + "\n";
        }
        return toString;
    }
}
