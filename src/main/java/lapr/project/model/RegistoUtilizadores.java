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
}
