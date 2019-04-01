/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

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
public class calculadoraTest {
    
    public calculadoraTest() {
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
     * Test of suma method, of class calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        calculadora instance = new calculadora(5,3);
        double expResult = 8;
        double result = instance.suma();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        calculadora instance = new calculadora(5,3);
        double expResult = 2;
        double result = instance.resta();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicacion method, of class calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        calculadora instance = new calculadora(5,3);
        double expResult = 15;
        double result = instance.multiplicacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        calculadora instance = new calculadora(5,3);
        double expResult = 1.6666666666666667;
        double result = instance.division();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
    
}
