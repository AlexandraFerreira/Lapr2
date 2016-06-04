/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.date.Data;
import lapr.project.model.CentroExposicoes;
import lapr.project.model.Exposicao;
import lapr.project.model.Organizador;
import lapr.project.model.RegistoUtilizadores;
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
public class InserirExposicaoControllerTest {
    
    public InserirExposicaoControllerTest() {
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
     * Test of novaExposicao method, of class InserirExposicaoController.
     */
    @Test
    public void testNovaExposicao() {
        System.out.println("novaExposicao");
        CentroExposicoes empresa = new CentroExposicoes();
        InserirExposicaoController instance = new InserirExposicaoController(empresa);
        instance.novaExposicao();
        String expResult = empresa.toString();
        String result = empresa.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDados method, of class InserirExposicaoController.
     */
    @Test
    public void testSetDados() {
        System.out.println("setDados");
        String titulo = "titulo";
        String descritivo = "descritivo";
        Data dataInicio = new Data(1212, 12, 12);
        Data dataFim = new Data(1212, 12, 13);
        Data subInicio = new Data(1212, 12, 12);
        Data subFim = new Data(1212, 12, 12);
        String local = "local";
        InserirExposicaoController instance = null;
        instance.setDados(titulo, descritivo, dataInicio, dataFim, subInicio, subFim, local);
    }

    /**
     * Test of getUtilizador method, of class InserirExposicaoController.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        String userId = "";
        InserirExposicaoController instance = null;
        Utilizador expResult = null;
        Utilizador result = instance.getUtilizador(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addOrganizador method, of class InserirExposicaoController.
     */
    @Test
    public void testAddOrganizador() {
        System.out.println("addOrganizador");
        CentroExposicoes empresa = new CentroExposicoes();
        Exposicao e = new Exposicao();
        Utilizador u = new Utilizador("Alexandra", "email@email.email", "Alex", "pass");
        empresa.getRegistoUtilizadores().registaUtilizador(u);
        String strId = "Alex";
        InserirExposicaoController instance = new InserirExposicaoController(empresa);
        instance.setExposicao(e);
        boolean expResult = true;
        boolean result = instance.addOrganizador(strId);

        assertEquals(expResult, result);
    }

    /**
     * Test of removerOrganizador method, of class InserirExposicaoController.
     */
    @Test
    public void testRemoverOrganizador() {
        System.out.println("removerOrganizador");
        CentroExposicoes empresa = new CentroExposicoes();
        Utilizador u = new Utilizador();
        String strId = "Alex";
        u.setUsername(strId);
        Organizador o = new Organizador(u);
        empresa.getRegistoUtilizadores().addUtilizador(u);
        Exposicao expo = new Exposicao();
        empresa.getRegistoExposicoes().registaExposicao(expo);
        InserirExposicaoController instance = new InserirExposicaoController(empresa);
        instance.setExposicao(expo);
        instance.addOrganizador(strId);
        boolean expResult = true;
        boolean result = instance.removerOrganizador(expo.getListaOrganizadores().obterOrganizador(0));
        assertEquals(expResult, result);
    }

    /**
     * Test of validaExposicao method, of class InserirExposicaoController.
     */
    @Test
    public void testValidaExposicao() {
        System.out.println("validaExposicao");
        InserirExposicaoController instance = null;
        boolean expResult = false;
        boolean result = instance.validaExposicao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaExposicao method, of class InserirExposicaoController.
     */
    @Test
    public void testRegistaExposicao() {
        System.out.println("registaExposicao");
        CentroExposicoes ce = new CentroExposicoes();
        InserirExposicaoController instance = new InserirExposicaoController(ce);
        
        instance.novaExposicao();
        instance.getExposicao().getListaOrganizadores().getListaOrganizadores().
                add(new Organizador(new Utilizador()));
        instance.setDados("Titulo", "Descritivo", new Data(1212, 12, 11), 
                new Data(1212, 12, 12), new Data(1212, 12, 11), new Data(1212, 12, 12), "Local");
        
        boolean expResult = true;
        boolean result = instance.registaExposicao();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaUtilizadores method, of class InserirExposicaoController.
     */
    @Test
    public void testGetListaUtilizadores() {
        System.out.println("getListaUtilizadores");
        InserirExposicaoController instance = null;
        RegistoUtilizadores expResult = null;
        RegistoUtilizadores result = instance.getListaUtilizadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
    
}
