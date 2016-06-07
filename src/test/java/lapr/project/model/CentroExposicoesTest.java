/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.List;
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
public class CentroExposicoesTest {
    
    public CentroExposicoesTest() {
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
     * Test of getRegistoExposicoes method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoExposicoes() {
        System.out.println("getRegistoExposicoes");
        CentroExposicoes instance = new CentroExposicoes();
        RegistoExposicoes re = new RegistoExposicoes();
        boolean expResult = true;
        boolean result = re.equals(instance.getRegistoExposicoes());
        assertEquals(expResult, result);
    }

    /**
     * Test of getRegistoUtilizadores method, of class CentroExposicoes.
     */
    @Test
    public void testGetRegistoUtilizadores() {
        System.out.println("getRegistoUtilizadores");
        CentroExposicoes instance = new CentroExposicoes();
        RegistoUtilizadores m_RegUtilizadores = new RegistoUtilizadores();
        boolean expResult = true;
        boolean result = m_RegUtilizadores.equals(instance.getRegistoUtilizadores());
        assertEquals(expResult, result);
    }

    /**
     * Test of getExposicoes method, of class CentroExposicoes.
     */
    @Test
    public void testGetExposicoes() {
        System.out.println("getExposicoes");
        CentroExposicoes instance = new CentroExposicoes();
        Exposicao expResult = null;
        Exposicao result = instance.getExposicoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_registaExposicao method, of class CentroExposicoes.
     */
    @Test
    public void testGetM_registaExposicao() {
        System.out.println("getM_registaExposicao");
        CentroExposicoes instance = new CentroExposicoes();
        List<Exposicao> expResult = null;
        List<Exposicao> result = instance.getM_registaExposicao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
