package excepciones;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraDosIT {

    public CalculadoraDosIT() {
    }

    /**
     * Test of sumar method, of class CalculadoraDos.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 5;
        int b = 5;
        CalculadoraDos instance = new CalculadoraDos();
        int expResult = 10;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class CalculadoraDos.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 20;
        int b = 6;
        CalculadoraDos instance = new CalculadoraDos();
        int expResult = 14;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class CalculadoraDos.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 5;
        int b = 3;
        CalculadoraDos instance = new CalculadoraDos();
        int expResult = 15;
        int result = instance.multiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class CalculadoraDos.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 15;
        int b = 3;
        CalculadoraDos instance = new CalculadoraDos();
        int expResult = 5;
        int result = instance.dividir(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test(expected=ArithmeticException.class)
    public void testDividirPorCero(){
        CalculadoraDos calc =new CalculadoraDos();
        calc.dividir(10,0);
    }
}
