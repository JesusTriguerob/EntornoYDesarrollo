/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalumno;

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
public class ProcesaAlumTest {
    
    public ProcesaAlumTest() {
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
     * Test of entradaDatos method, of class ProcesaAlum.
     */
    @Test
    public void testEntradaDatos() {
        System.out.println("entradaDatos");
        Alumno[] grupo = null;
        ProcesaAlum.entradaDatos(grupo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salidaDatos method, of class ProcesaAlum.
     */
    @Test
    public void testSalidaDatos() {
        System.out.println("salidaDatos");
        Alumno[] grupo = null;
        ProcesaAlum.salidaDatos(grupo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ProcesaAlum.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ProcesaAlum.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
