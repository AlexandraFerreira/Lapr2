/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public class AlterarUtilizadorController {

    private CentroExposicoes empresa;
    private Utilizador utilizador;

    public AlterarUtilizadorController(CentroExposicoes empresa) {
        this.empresa = empresa;
    }

    public Utilizador getUtilizador(String strID) {
        utilizador = empresa.getRegistoUtilizadores().getUtilizador(strID);
        return utilizador;
    }

    public boolean setDados(String strNome, String strEmail, String strUsername, String strPwd) {
        
        Utilizador uClone = utilizador.clone();
        
        uClone.setNome(strNome);
        uClone.setEmail(strEmail);
        uClone.setUsername(strUsername);
        uClone.setPassword(strPwd);
        
        return empresa.getRegistoUtilizadores().alteraUtilizador(utilizador, uClone);
    }
}
