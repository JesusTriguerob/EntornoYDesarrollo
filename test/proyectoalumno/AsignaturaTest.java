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
public class AsignaturaTest {
    
    public AsignaturaTest() {
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
     * Test of getNombre method, of class Asignatura.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Asignatura instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Asignatura.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Asignatura instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurso method, of class Asignatura.
     */
    @Test
    public void testGetCurso() {
        System.out.println("getCurso");
        Asignatura instance = null;
        String expResult = "";
        String result = instance.getCurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurso method, of class Asignatura.
     */
    @Test
    public void testSetCurso() {
        System.out.println("setCurso");
        String curso = "";
        Asignatura instance = null;
        instance.setCurso(curso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNota method, of class Asignatura.
     */
    @Test
    public void testGetNota() {
        System.out.println("getNota");
        Asignatura instance = null;
        double expResult = 0.0;
        double result = instance.getNota();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNota method, of class Asignatura.
     */
    @Test
    public void testSetNota() {
        System.out.println("setNota");
        double nota = 0.0;
        Asignatura instance = null;
        instance.setNota(nota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notaMedia method, of class Asignatura.
     */
    @Test
    public void testNotaMedia() {
        System.out.println("notaMedia");
        double nota1eva = 0.0;
        double nota2eva = 0.0;
        double nota3eva = 0.0;
        Asignatura instance = null;
        double expResult = 0.0;
        double result = instance.notaMedia(nota1eva, nota2eva, nota3eva);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
