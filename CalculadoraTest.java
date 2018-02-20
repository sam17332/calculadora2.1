/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hecto
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getInstance method, of class Calculadora.
     */
    @Test
    public void testGetInstance() {
   
    }

    /**
     * Test of calcular method, of class Calculadora.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        String esp = "2 2 + 1 + 2 *";
        String tipo = "1";
        Calculadora instance = new Calculadora();
        String expResult = "10";
        String result = instance.calcular(esp, tipo);
        assertEquals(expResult, result);
        tipo = "2";
        result = instance.calcular(esp, tipo);
        assertEquals(expResult,result);
        tipo = "3";
        result = instance.calcular(esp, tipo);
        assertEquals(expResult,result);
        tipo = "4";
        result = instance.calcular(esp, tipo);
        assertEquals(expResult,result);
        tipo = "5";
        result = instance.calcular(esp, tipo);
        assertEquals(expResult,result);
    }
    
}
