/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamientostring;

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
public class metodo1Test {
    
    public metodo1Test() {
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
     * Test of cuentaVocales method, of class metodo1.
     */
    @Test
    public void testCuentaVocales() {
        System.out.println("cuentaVocales");
        String cadena = "hola";
        int expResult = 2;
        int result = metodo1.cuentaVocales(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of invierteCadena method, of class metodo1.
     */
    @Test
    public void testInvierteCadena() {
        System.out.println("invierteCadena");
        String cadena = "hola";
        String expResult = "aloh";
        String result = metodo1.invierteCadena(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
