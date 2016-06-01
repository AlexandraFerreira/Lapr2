/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.Date;
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
public class ExposicaoTest {
    
    public ExposicaoTest() {
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
     * Test of getTitulo method, of class Exposicao.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Exposicao instance = new Exposicao();
        instance.setTitulo("Exponor");
        String expResult = "Exponor";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescritivo method, of class Exposicao.
     */
    @Test
    public void testGetDescritivo() {
        System.out.println("getDescritivo");
        Exposicao instance = new Exposicao();
        instance.setDescritivo("Isto e o descritivo da exposicao");
        String expResult = "Isto e o descritivo da exposicao";
        String result = instance.getDescritivo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataInicio method, of class Exposicao.
     */
    @Test
    public void testGetDataInicio() {
        System.out.println("getDataInicio");
        Exposicao instance = new Exposicao();
        Date expResult = new Date(12-12-1212);
        instance.setDataInicio(expResult);
        Date result = instance.getDataInicio();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataFim method, of class Exposicao.
     */
    @Test
    public void testGetDataFim() {
        System.out.println("getDataFim");
        Exposicao instance = new Exposicao();
        Date expResult = new Date(12-12-1212);
        instance.setDataFim(expResult);
        Date result = instance.getDataFim();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLocal method, of class Exposicao.
     */
    @Test
    public void testGetLocal() {
        System.out.println("getLocal");
        Exposicao instance = new Exposicao();
        instance.setLocal("Porto");
        String expResult = "Porto";
        String result = instance.getLocal();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaOrganizadores method, of class Exposicao.
     */
    @Test
    public void testGetListaOrganizadores() {
        System.out.println("getListaOrganizadores");
        Exposicao instance = new Exposicao();
        List<Organizador> expResult = new ArrayList<>();
        List<Organizador> result = instance.getListaOrganizadores();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitulo method, of class Exposicao.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "Exponor";
        Exposicao instance = new Exposicao();
        instance.setTitulo(titulo);
        String expResult = "Exponor";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescritivo method, of class Exposicao.
     */
    @Test
    public void testSetDescritivo() {
        System.out.println("setDescritivo");
        String text_descritivo = "Isto e o descritivo da exposicao";
        Exposicao instance = new Exposicao();
        instance.setDescritivo(text_descritivo);
        String expResult = "Isto e o descritivo da exposicao";
        String result = instance.getDescritivo();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Exposicao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = new Object();
        Exposicao instance = new Exposicao();
        instance.setTitulo("Exponor");
        instance.setDescritivo("Isto é o descritivo da exposição");
        instance.setPeriodo(null, null);
        instance.setLocal("Porto");
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataInicio method, of class Exposicao.
     */
    @Test
    public void testSetDataInicio() {
        System.out.println("setDataInicio");
        Date dtInicio = new Date(12-12-1212);
        Exposicao instance = new Exposicao();
        instance.setDataInicio(dtInicio);
        Date expResult = new Date(12-12-1212);
        Date result = instance.getDataInicio();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setDataFim method, of class Exposicao.
     */
    @Test
    public void testSetDataFim() {
        System.out.println("setDataFim");
        Date dtFim = new Date(12-12-1212);
        Exposicao instance = new Exposicao();
        instance.setDataFim(dtFim);
        Date expResult = new Date(12-12-1212);
        Date result = instance.getDataFim();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPeriodo method, of class Exposicao.
     */
    @Test
    public void testSetPeriodo() {
        System.out.println("setPeriodo");
        Date dtInicio = new Date(12-12-1212);
        Date dtFim = new Date(13-12-1212);
        Exposicao instance = new Exposicao();
        instance.setTitulo("Exponor");
        instance.setDescritivo("Descricao");
        instance.setPeriodo(dtInicio, dtFim);
        instance.setLocal("Porto");
        String expResult = "Título: Exponor; Texto Descritivo: Descricao; "
                + "Data de Início: 12-12-1212; Data de Fim: 13-12-1212; Local: Porto.\nOrganizadores:\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLocal method, of class Exposicao.
     */
    @Test
    public void testSetLocal() {
        System.out.println("setLocal");
        String local = "Porto";
        Exposicao instance = new Exposicao();
        instance.setLocal(local);
        String expResult = "Porto";
        String result = instance.getLocal();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Exposicao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Exposicao instance = new Exposicao();
        instance.setTitulo("Exponor");
        instance.setDescritivo("Isto e o descritivo da exposicao");
        instance.setPeriodo(new Date(12,12,1212), new Date(12,12,1212));
        instance.setLocal("Porto");
        String expResult = "Título: Exponor; Texto Descritivo: Isto e o descritivo da exposicao; "
                + "Data de Início: 12-12-1212; Data de Fim: 12-12-1212; Local: Porto.\nOrganizadores:\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }    
}
