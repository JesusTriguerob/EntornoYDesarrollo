/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Suite;

/**
 *
 * @author jesus
 */
@RunWith (value = Parameterized.class)

public class Calculadora2TestPara {
    
    double numero1;
    double numero2;
    double expResult;
    
    public Calculadora2TestPara(double numero1, double numero2, double expResult) {
        this.numero1=numero1;
        this.numero2=numero2;
        this.expResult=expResult;
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {{10,3,1},{20,8,4},{15,2,1},{30,9,3}};
        return Arrays.asList(data);
    }
    
    /**
     * Test of modulo method, of class Calculadora2.
     */
    @Test
    public void testModulo() {
        System.out.println("modulo");
        Calculadora.Calculadora2 instance = new Calculadora.Calculadora2();
        double result = instance.modulo(numero1, numero2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
