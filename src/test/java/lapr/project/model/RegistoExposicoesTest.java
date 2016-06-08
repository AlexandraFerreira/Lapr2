/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;
import lapr.project.utils.Data;
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
public class RegistoExposicoesTest {

    public RegistoExposicoesTest() {
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
     * Test of novaExposicao method, of class RegistoExposicoes.
     */
    @Test
    public void testNovaExposicao() {
        System.out.println("novaExposicao");
        RegistoExposicoes instance = new RegistoExposicoes();

        Exposicao expo1 = instance.novaExposicao();
        Exposicao expo2 = new Exposicao();

        boolean expResult = true;
        boolean result = expo1.equals(expo2);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaExposicao method, of class RegistoExposicoes.
     */
    @Test
    public void testValidaExposicao() {
        System.out.println("validaExposicao");
        Exposicao e = null;
        RegistoExposicoes instance = new RegistoExposicoes();
        boolean expResult = false;
        boolean result = instance.validaExposicao(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaExposicao method, of class RegistoExposicoes.
     */
    @Test
    public void testRegistaExposicao() {
        System.out.println("registaExposicao");
        Exposicao e = new Exposicao("t", "t", new Data(1212, 12, 12), new Data(1212, 12, 12),
                new Data(1212, 12, 12), new Data(1212, 12, 12), "l");
        RegistoExposicoes instance = new RegistoExposicoes();
        boolean expResult = true;
        boolean result = instance.registaExposicao(e);
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class RegistoExposicoes.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Exposicao e = new Exposicao("t", "t", new Data(1212, 12, 12), new Data(1212, 12, 12),
                new Data(1212, 12, 12), new Data(1212, 12, 12), "l");
        RegistoExposicoes instance = new RegistoExposicoes();
        boolean expResult = true;
        boolean result = instance.add(e);
        instance.add(e);
        assertEquals(expResult, result);
    }

    /**
     * Test of listarExposicoes method, of class RegistoExposicoes.
     */
    @Test
    public void testListarExposicoes() {
        System.out.println("listarExposicoes");
        Exposicao e = null;
        RegistoExposicoes instance = new RegistoExposicoes();
        instance.listarExposicoes(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaDecisao method, of class RegistoExposicoes.
     */
    @Test
    public void testRegistaDecisao() {
        System.out.println("registaDecisao");
        Decisao d = null;
        RegistoExposicoes instance = new RegistoExposicoes();
        boolean expResult = false;
        boolean result = instance.registaDecisao(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaDecisao method, of class RegistoExposicoes.
     */
    @Test
    public void testValidaDecisao() {
        System.out.println("validaDecisao");
        Decisao d = null;
        RegistoExposicoes instance = new RegistoExposicoes();
        boolean expResult = false;
        boolean result = instance.validaDecisao(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCandidaturasExposicao method, of class RegistoExposicoes.
     */
    @Test
    public void testGetCandidaturasExposicao() {
        System.out.println("getCandidaturasExposicao");
        RegistoExposicoes instance = new RegistoExposicoes();
        List<CandidaturaAExposicao> expResult = null;
        List<CandidaturaAExposicao> result = instance.getCandidaturasExposicao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
