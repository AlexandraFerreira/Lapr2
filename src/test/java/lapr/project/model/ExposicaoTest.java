/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lapr.project.date.Data;
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
        Data dataTeste = new Data(1212, 12, 12);
        instance.setDataInicio(dataTeste);
        Data expResult = new Data(1212, 12, 12);
        Data result = instance.getDataInicio();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDataFim method, of class Exposicao.
     */
    @Test
    public void testGetDataFim() {
        System.out.println("getDataFim");
        Exposicao instance = new Exposicao();
        Data dataTeste = new Data(1212, 12, 12);
        instance.setDataFim(dataTeste);
        Data expResult = new Data(1212, 12, 12);
        Data result = instance.getDataFim();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getSubInicio method, of class Exposicao.
     */
    @Test
    public void testGetSubInicio() {
        System.out.println("getSubInicio");
        Exposicao instance = new Exposicao();
        Data dataTeste = new Data(1212, 12, 12);
        instance.setDataSubInicio(dataTeste);
        Data expResult = new Data(1212, 12, 12);
        Data result = instance.getSubInicio();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSubFim method, of class Exposicao.
     */
    @Test
    public void testGetSubFim() {
        System.out.println("getSubFim");
        Exposicao instance = new Exposicao();
        Data dataTeste = new Data(1212, 12, 12);
        instance.setDataSubFim(dataTeste);
        Data expResult = new Data(1212, 12, 12);
        Data result = instance.getSubFim();
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
        ListaOrganizadores expResult = null;
        ListaOrganizadores result = instance.getListaOrganizadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of setDataInicio method, of class Exposicao.
     */
    @Test
    public void testSetDataInicio() {
        System.out.println("setDataInicio");
        Data dtInicio = new Data(1212, 12, 12);
        Exposicao instance = new Exposicao();
        instance.setDataInicio(dtInicio);
        Data expResult = new Data(1212, 12, 12);
        Data result = instance.getDataInicio();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setDataFim method, of class Exposicao.
     */
    @Test
    public void testSetDataFim() {
        System.out.println("setDataFim");
        Data dtFim = new Data(1212, 12, 12);
        Exposicao instance = new Exposicao();
        instance.setDataFim(dtFim);
        Data expResult = new Data(1212, 12, 12);
        Data result = instance.getDataFim();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setDataSubInicio method, of class Exposicao.
     */
    @Test
    public void testSetDataSubInicio() {
        System.out.println("setDataSubInicio");
        Data subInicio = new Data(1212, 12, 12);
        Exposicao instance = new Exposicao();
        instance.setDataSubInicio(subInicio);
        Data expResult = new Data(1212, 12, 12);
        Data result = instance.getSubInicio();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataSubFim method, of class Exposicao.
     */
    @Test
    public void testSetDataSubFim() {
        System.out.println("setDataSubFim");
        Data subFim = new Data(1212, 12, 12);
        Exposicao instance = new Exposicao();
        instance.setDataSubFim(subFim);
        Data expResult = new Data(1212, 12, 12);
        Data result = instance.getSubFim();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setPeriodoRealizacao method, of class Exposicao.
     */
    @Test
    public void testSetPeriodoRealizacao() {
        System.out.println("setPeriodoRealizacao");
        Data dtInicio = new Data(1212, 12, 12);
        Data dtFim = new Data(1313, 12, 13);
        Exposicao instance = new Exposicao();
        instance.setPeriodoRealizacao(dtInicio, dtFim);
        
        Data expResult = new Data(1212, 12, 12);
        Data expResult1 = new Data(1313, 12, 13);
        Data result = instance.getDataInicio();
        Data result1 = instance.getDataFim();
        
        assertEquals(expResult, result);
        assertEquals(expResult1, result1);
    }
    
    /**
     * Test of setPeriodoSubmissao method, of class Exposicao.
     */
    @Test
    public void testSetPeriodoSubmissao() {
        System.out.println("setPeriodoSubmissao");
        Data subInicio = new Data(1212, 12, 12);
        Data subFim = new Data(1313, 12, 13);
        Exposicao instance = new Exposicao();
        instance.setPeriodoSubmissao(subInicio, subFim);
        
        Data expResult = new Data(1212, 12, 12);
        Data expResult1 = new Data(1313, 12, 13);
        Data result = instance.getSubInicio();
        Data result1 = instance.getSubFim();
        
        assertEquals(expResult, result);
        assertEquals(expResult1, result1);
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
        instance.setPeriodoRealizacao(new Data(1212, 12, 12), new Data(1313, 12, 13));
        instance.setLocal("Porto");
        String expResult = "Título: Exponor; Texto Descritivo: Isto e o descritivo da exposicao; "
                + "Data de Início: 12-12-1212; Data de Fim: 13-12-1313; Local: Porto.\nOrganizadores:\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    } 

    /**
     * Test of equals method, of class Exposicao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = new Exposicao("titulo", "descritivo", new Data(1212, 12, 12), 
                new Data(1212, 12, 13), "local");
        Exposicao instance = new Exposicao();
        instance.setTitulo("titulo");
        instance.setDescritivo("descritivo");
        instance.setDataInicio(new Data(1212, 12, 12));
        instance.setDataFim(new Data(1212, 12, 13));
        instance.setLocal("local");
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }
}
