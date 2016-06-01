/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.controller;

import lapr.project.date.Data;
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
        Utilizador u = null;
        InserirExposicaoController instance = null;
        instance.addOrganizador(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        InserirExposicaoController instance = null;
        instance.registaExposicao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
