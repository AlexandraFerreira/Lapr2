/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
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
public class ListaOrganizadoresTest {
    
    public ListaOrganizadoresTest() {
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
     * Test of getListaOrganizadores method, of class ListaOrganizadores.
     */
    @Test
    public void testGetListaOrganizadores() {
        System.out.println("getListaOrganizadores");
        Utilizador u = new Utilizador("nome", "email@email.pt", "user", "Pa2.");
        Organizador o = new Organizador(u);
        ListaOrganizadores instance = new ListaOrganizadores();
        List<Organizador> lo = new ArrayList<>();
        lo.add(o);
        instance.setListaOrganizadores(lo);
        List<Organizador> expResult = lo;
        List<Organizador> result = instance.getListaOrganizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of addOrganizador method, of class ListaOrganizadores.
     */
    @Test
    public void testAddOrganizador_Utilizador() {
        System.out.println("addOrganizador");
        Utilizador u = new Utilizador("nome", "email@email.pt", "user", "Pa2.");
        ListaOrganizadores instance = new ListaOrganizadores();
        boolean expResult = true;
        boolean result = instance.addOrganizador(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of addOrganizador method, of class ListaOrganizadores.
     */
    @Test
    public void testAddOrganizador_Organizador() {
        System.out.println("addOrganizador");
        Utilizador u = new Utilizador("nome", "email@email.pt", "user", "Pa2.");
        Organizador o = new Organizador(u);
        ListaOrganizadores instance = new ListaOrganizadores();
        boolean expResult = true;
        boolean result = instance.addOrganizador(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeOrganizador method, of class ListaOrganizadores.
     */
    @Test
    public void testRemoveOrganizador() {
        System.out.println("removeOrganizador");
        Utilizador u = new Utilizador("nome", "email@email.pt", "user", "Pa2.");
        Organizador o = new Organizador(u);
        ListaOrganizadores instance = new ListaOrganizadores();
        instance.addOrganizador(o);
        boolean expResult = true;
        boolean result = instance.removeOrganizador(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of validaOrganizador method, of class ListaOrganizadores.
     */
    @Test
    public void testValidaOrganizador() {
        System.out.println("validaOrganizador");
        Utilizador u = new Utilizador("nome", "email@email.pt", "user", "Pa2.");
        Organizador o = new Organizador(u);
        ListaOrganizadores instance = new ListaOrganizadores();
        boolean expResult = true;
        boolean result = instance.validaOrganizador(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of valida method, of class ListaOrganizadores.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        Utilizador u = new Utilizador("nome", "email@email.pt", "user", "Pa2.");
        ListaOrganizadores instance = new ListaOrganizadores();
        instance.addOrganizador(u);
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }

    /**
     * Test of hasOrganizador method, of class ListaOrganizadores.
     */
    @Test
    public void testHasOrganizador() {
        System.out.println("hasOrganizador");
        String strID = "user";
        Utilizador u = new Utilizador("nome", "email@email.pt", "user", "Pa2.");
        Organizador o = new Organizador(u);
        ListaOrganizadores instance = new ListaOrganizadores();
        instance.addOrganizador(o);
        boolean expResult = true;
        boolean result = instance.hasOrganizador(strID);
        assertEquals(expResult, result);
    }

    /**
     * Test of tamanho method, of class ListaOrganizadores.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        Utilizador u = new Utilizador("nome", "email@email.pt", "user", "Pa2.");
        Organizador o = new Organizador(u);
        ListaOrganizadores instance = new ListaOrganizadores();
        instance.addOrganizador(o);
        int expResult = 1;
        int result = instance.tamanho();
        assertEquals(expResult, result);
    }

    /**
     * Test of obterOrganizador method, of class ListaOrganizadores.
     */
    @Test
    public void testObterOrganizador() {
        System.out.println("obterOrganizador");
        int Index = 0;
        Utilizador u = new Utilizador("nome", "email@email.pt", "user", "Pa2.");
        Organizador o = new Organizador(u);
        ListaOrganizadores instance = new ListaOrganizadores();
        instance.addOrganizador(o);
        Organizador expResult = o;
        Organizador result = instance.obterOrganizador(Index);
        assertEquals(expResult, result);
    }

    /**
     * Test of indiceDe method, of class ListaOrganizadores.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        Utilizador u = new Utilizador("nome", "email@email.pt", "user", "Pa2.");
        Organizador o = new Organizador(u);
        ListaOrganizadores instance = new ListaOrganizadores();
        instance.addOrganizador(o);
        int expResult = 0;
        int result = instance.indiceDe(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of toArray method, of class ListaOrganizadores.
     */
    @Test
    public void testToArray() {
        System.out.println("toArray");
        Utilizador u = new Utilizador("nome", "email@email.pt", "user", "Pa2.");
        Organizador o = new Organizador(u);
        ListaOrganizadores instance = new ListaOrganizadores();
        instance.addOrganizador(o);
        Organizador[] expResult = new Organizador[instance.tamanho()];
        expResult[0] = o;
        Organizador[] result = instance.toArray();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setListaOrganizadores method, of class ListaOrganizadores.
     */
    @Test
    public void testSetListaOrganizadores() {
        System.out.println("getListaOrganizadores");
        Utilizador u = new Utilizador("nome", "email@email.pt", "user", "Pa2.");
        Organizador o = new Organizador(u);
        ListaOrganizadores instance = new ListaOrganizadores();
        List<Organizador> lo = new ArrayList<>();
        lo.add(o);
        instance.setListaOrganizadores(lo);
        List<Organizador> expResult = lo;
        List<Organizador> result = instance.getListaOrganizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class ListaOrganizadores.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ListaOrganizadores instance = new ListaOrganizadores();
        String expResult = "";
        for (Organizador org : instance.getListaOrganizadores()) {
            expResult += org.toString();
        }
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
