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
public class RegistoUtilizadoresTest {
    
    public RegistoUtilizadoresTest() {
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
     * Test of getUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        String id = "username";
        RegistoUtilizadores instance = new RegistoUtilizadores();
        Utilizador utilizador = new Utilizador();
        utilizador.setUsername(id);
        instance.addUtilizador(utilizador);
        boolean expResult = true;
        boolean result = instance.getUtilizador(id).equals(utilizador);
        assertEquals(expResult, result);
    }

    /**
     * Test of alteraUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testAlteraUtilizador() {
        System.out.println("alteraUtilizador");
        List<Utilizador> listaUtilizadores = new ArrayList<>();
        Utilizador uOriginal = new Utilizador("Nome", "email@gmail.com", "Username", "Pass2.");
        Utilizador uClone = uOriginal;
        listaUtilizadores.add(uOriginal);
        RegistoUtilizadores instance = new RegistoUtilizadores();
        instance.setListaUtilizadores(listaUtilizadores);
        boolean expResult = true;
        boolean result = instance.alteraUtilizador(uOriginal, uClone);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaUtilizadores method, of class RegistoUtilizadores.
     */
    @Test
    public void testGetListaUtilizadores() {
        System.out.println("getListaUtilizadores");
        Utilizador u = new Utilizador("Nome", "email@gmail.com", "Username", "Pass2.");
        List<Utilizador> list = new ArrayList<>();
        list.add(u);
        RegistoUtilizadores instance = new RegistoUtilizadores();
        instance.setListaUtilizadores(list);
        List<Utilizador> expResult = list;
        List<Utilizador> result = instance.getListaUtilizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of setListaUtilizadores method, of class RegistoUtilizadores.
     */
    @Test
    public void testSetListaUtilizadores() {
        System.out.println("setListaUtilizadores");
        Utilizador u = new Utilizador("Nome", "email@gmail.com", "Username", "Pass2.");
        List<Utilizador> list = new ArrayList<>();
        list.add(u);
        RegistoUtilizadores instance = new RegistoUtilizadores();
        instance.setListaUtilizadores(list);
        List<Utilizador> expResult = list;
        List<Utilizador> result = instance.getListaUtilizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of novoUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testNovoUtilizador() {
        System.out.println("novoUtilizador");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        Utilizador utilizador1 = instance.novoUtilizador();
        Utilizador utilizador2 = new Utilizador();
        boolean expResult = true;
        boolean result = utilizador1.equals(utilizador2);
        assertEquals(expResult, result);
    }

    /**
     * Test of registaUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testRegistaUtilizador() {
        System.out.println("registaUtilizador");
        Utilizador u = new Utilizador("Nome", "email@gmail.com", "Username", "Pass2.");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        boolean expResult = true;
        boolean result = instance.registaUtilizador(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of addUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testAddUtilizador() {
        System.out.println("addUtilizador");
        Utilizador u = new Utilizador("Nome", "email@gmail.com", "Username", "Pass2.");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        boolean expResult = true;
        boolean result = instance.addUtilizador(u);;
        assertEquals(expResult, result);
    }

    /**
     * Test of removerUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testRemoverUtilizador() {
        System.out.println("removerUtilizador");
        Utilizador u = new Utilizador("Nome", "email@gmail.com", "Username", "Pass2.");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        instance.addUtilizador(u);
        boolean expResult = true;
        boolean result = instance.removerUtilizador(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of tamanho method, of class RegistoUtilizadores.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        Utilizador u = new Utilizador("Nome", "email@gmail.com", "Username", "Pass2.");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        instance.registaUtilizador(u);
        int expResult = 1;
        int result = instance.tamanho();
        assertEquals(expResult, result);
    }

    /**
     * Test of obterUtilizador method, of class RegistoUtilizadores.
     */
    @Test
    public void testObterUtilizador() {
        System.out.println("obterUtilizador");
        int Index = 0;
        Utilizador u = new Utilizador("Nome", "email@gmail.com", "Username", "Pass2.");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        instance.registaUtilizador(u);
        Utilizador expResult = u;
        Utilizador result = instance.obterUtilizador(Index);
        assertEquals(expResult, result);
    }

    /**
     * Test of indiceDe method, of class RegistoUtilizadores.
     */
    @Test
    public void testIndiceDe() {
        System.out.println("indiceDe");
        Utilizador u = new Utilizador("Nome", "email@gmail.com", "Username", "Pass2.");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        instance.registaUtilizador(u);
        int expResult = 0;
        int result = instance.indiceDe(u);
        assertEquals(expResult, result);
    }

    /**
     * Test of toArray method, of class RegistoUtilizadores.
     */
    @Test
    public void testToArray() {
        System.out.println("toArray");
        Utilizador u = new Utilizador("Nome", "email@gmail.com", "Username", "Pass2.");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        instance.registaUtilizador(u);
        Utilizador[] expResult = new Utilizador[instance.tamanho()];
        expResult[0] = u;
        Utilizador[] result = instance.toArray();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of equals method, of class RegistoUtilizadores.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        RegistoUtilizadores outro_ru = new RegistoUtilizadores();
        RegistoUtilizadores instance = new RegistoUtilizadores();
        boolean expResult = true;
        boolean result = instance.equals(outro_ru);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class RegistoUtilizadores.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        String expResult = "";
        for (Utilizador u : instance.getListaUtilizadores()) {
            expResult += u.toString() + "\n";
        }
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
