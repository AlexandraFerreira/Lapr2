/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fábio Sousa
 */
public class ProdutoTest {
    
    public ProdutoTest() {
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
     * Test of getNome method, of class Produto.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Produto instance = new Produto();
        instance.setNome("Exponor");
        String expResult = "Exponor";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Produto.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Exponor";
        Produto instance = new Produto();
        instance.setNome(nome);
        String expResult = "Exponor";
        String result = instance.getNome();
         assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class Produto.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Produto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Produto.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
