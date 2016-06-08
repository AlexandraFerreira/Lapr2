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
public class UtilizadorTest {

    public UtilizadorTest() {
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
     * Test of getNome method, of class Utilizador.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Utilizador instance = new Utilizador();
        instance.setNome("user");
        String expResult = "user";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmail method, of class Utilizador.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Utilizador instance = new Utilizador();
        instance.setEmail("email@email.pt");
        String expResult = "email@email.pt";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsername method, of class Utilizador.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Utilizador instance = new Utilizador();
        instance.setUsername("username");
        String expResult = "username";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class Utilizador.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Utilizador instance = new Utilizador();
        instance.setPassword("Pa2.");
        String expResult = "Pa2.";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Utilizador.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "nome";
        Utilizador instance = new Utilizador();
        instance.setNome(nome);
        String expResult = "nome";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Utilizador.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "email@email.com";
        Utilizador instance = new Utilizador();
        instance.setEmail(email);
        String expResult = "email@email.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class Utilizador.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "username";
        Utilizador instance = new Utilizador();
        instance.setUsername(username);
        String expResult = "username";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class Utilizador.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "Pa2.";
        Utilizador instance = new Utilizador();
        instance.setPassword(password);
        String expResult = "Pa2.";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Utilizador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Utilizador instance = new Utilizador();
        instance.setNome("aaa");
        instance.setEmail("aaa@aaa.aaa");
        instance.setUsername("a");
        String expResult = "Utilizador:   Username: a; Email: aaa@aaa.aaa; Nome: aaa";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Utilizador.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = new Utilizador("nome", "email@email.pt", "user", "Pa2.");
        Utilizador instance = new Utilizador("nome", "email@email.pt", "user", "Pa2.");
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Utilizador.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Utilizador utilizador = new Utilizador();
        Utilizador instance = new Utilizador();
        int expResult = 0;
        int result = instance.compareTo(utilizador);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaNome method, of class Utilizador.
     */
    @Test
    public void testValidaNome() {
        System.out.println("validaNome");
        String nome = "nome";
        Utilizador instance = new Utilizador();
        instance.setNome(nome);
        boolean expResult = true;
        boolean result = instance.validaNome(nome);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaEmail method, of class Utilizador.
     */
    @Test
    public void testValidaEmail() {
        System.out.println("validaEmail");
        String email = "email@email.com";
        Utilizador instance = new Utilizador();
        instance.setEmail(email);
        boolean expResult = true;
        boolean result = instance.validaEmail(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaUsername method, of class Utilizador.
     */
    @Test
    public void testValidaUsername() {
        System.out.println("validaUsername");
        String userName = "user12";
        Utilizador instance = new Utilizador();
        instance.setUsername(userName);
        boolean expResult = true;
        boolean result = instance.validaUsername(userName);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaPassword method, of class Utilizador.
     */
    @Test
    public void testValidaPassword() {
        System.out.println("validaPassword");
        String password = "Pa2.";
        Utilizador instance = new Utilizador();
        instance.setPassword(password);
        boolean expResult = true;
        boolean result = instance.validaPassword(password);
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class Utilizador.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Utilizador instance = new Utilizador("nome", "email12@email.pt", "u12", "Pa2.");
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }

    /**
     * Test of clone method, of class Utilizador.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        Utilizador instance = new Utilizador("nome", "email12@email.pt", "u12", "Pa2.");
        String expResult = instance.toString();
        Utilizador u = instance.clone();
        String result = instance.clone().toString();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }

}
