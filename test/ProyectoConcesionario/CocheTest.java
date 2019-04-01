/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoConcesionario;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jesus
 */
public class CocheTest {
    
    public CocheTest() {
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
     * Test of getRuedas method, of class Coche.
     */
    @Test
    public void testGetRuedas() {
        System.out.println("getRuedas");
        int expResult = 0;
        int result = Coche.getRuedas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMatricula method, of class Coche.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        Coche instance = null;
        String expResult = "";
        String result = instance.getMatricula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarca method, of class Coche.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Coche instance = null;
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModelo method, of class Coche.
     */
    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        Coche instance = null;
        String expResult = "";
        String result = instance.getModelo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCombustible method, of class Coche.
     */
    @Test
    public void testGetCombustible() {
        System.out.println("getCombustible");
        Coche instance = null;
        char expResult = ' ';
        char result = instance.getCombustible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCilindrada method, of class Coche.
     */
    @Test
    public void testGetCilindrada() {
        System.out.println("getCilindrada");
        Coche instance = null;
        int expResult = 0;
        int result = instance.getCilindrada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Coche.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Coche instance = null;
        String expResult = "";
        String result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatricula method, of class Coche.
     */
    @Test
    public void testSetMatricula() {
        System.out.println("setMatricula");
        String matricula = "";
        Coche instance = null;
        instance.setMatricula(matricula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Coche.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        Coche instance = null;
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
