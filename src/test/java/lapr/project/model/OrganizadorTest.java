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
 * @author AlexandraFerreira 1140388
 */
public class OrganizadorTest {
    
    public OrganizadorTest() {
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
     * Test of getUtilizador method, of class Organizador.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        Utilizador u = new Utilizador("nome", "email@email.pt", "username", "Pa2.");
        Organizador instance = new Organizador(u);
        String expResult = "nome";
        String result = instance.getUtilizador().getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUtilizador method, of class Organizador.
     */
    @Test
    public void testSetUtilizador() {
        System.out.println("setUtilizador");
        Utilizador u = new Utilizador("nome", "email@email.pt", "username", "Pa2.");
        Organizador instance = new Organizador();
        instance.setUtilizador(u);
        String expResult = "nome";
        String result = instance.getUtilizador().getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class Organizador.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Utilizador u = new Utilizador("nome", "email@email.pt", "username", "Pa2.");
        Organizador instance = new Organizador(u);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Organizador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Utilizador u = new Utilizador("nome", "email@email.pt", "username", "Pa2.");
        Organizador instance = new Organizador(u);
        String expResult = "Organizador:   Utilizador:   Username: username; Email: email@email.pt;"
                + " Nome: nome";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of isUtilizador method, of class Organizador.
     */
    @Test
    public void testIsUtilizador() {
        System.out.println("isUtilizador");
        Utilizador u = new Utilizador("nome", "email@email.pt", "username", "Pa2.");
        Organizador instance = new Organizador(u);
        boolean expResult = true;
        boolean result = instance.isUtilizador(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Organizador.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Utilizador u = new Utilizador("nome", "email@email.pt", "username", "Pa2.");
        Utilizador u1 = new Utilizador("nome", "email@email.pt", "username", "Pa2.");
        Object outroObjeto = new Organizador(u);
        Organizador instance = new Organizador(u1);
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }
    
}
