/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.model.CentroExposicoes;
import lapr.project.model.Utilizador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public class AlterarUtilizadorControllerTest {
    
    public AlterarUtilizadorControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUtilizador method, of class AlterarUtilizadorController.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        String strID = "username";
        CentroExposicoes empresa = new CentroExposicoes();
        Utilizador utilizador = new Utilizador();
        utilizador.setUsername(strID);
        empresa.getRegistoUtilizadores().addUtilizador(utilizador);
        AlterarUtilizadorController instance = new AlterarUtilizadorController(empresa);
        Utilizador expResult = utilizador;
        Utilizador result = instance.getUtilizador(strID);
        assertEquals(expResult, result);
    }

    /**
     * Test of setDados method, of class AlterarUtilizadorController.
     */
    @Test
    public void testSetDados() {
        System.out.println("alteraDados");
        String strNome = "Nome";
        String strUsername = "Username";
        String strPwd = "Password";
        String strEmail = "email@isep.ipp.pt";
        CentroExposicoes empresa = new CentroExposicoes();
        AlterarUtilizadorController instance = new AlterarUtilizadorController(empresa);
        Utilizador u = new Utilizador();
        u.setUsername("username");
        empresa.getRegistoUtilizadores().addUtilizador(u);
        instance.getUtilizador("username");
        boolean expResult = true;
        boolean result = instance.setDados(strNome, strUsername, strPwd, strEmail);
        assertEquals(expResult, result);
    }
    
}
