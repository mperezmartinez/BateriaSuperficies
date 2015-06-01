/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class SuperficiesTest {
    
    public SuperficiesTest() {
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
     * Test of realizaOperacion method, of class Superficies.
     */
    @Test
    public void testRealizaOperacion() {
        System.out.println("realizaOperacion");
        float base = 5.0F;
        float altura = 4.0F;
        float radio = 2.0F;
        String oper = "Circulo";
        float expResult = 12.0F;
        float result = Superficies.realizaOperacion(base, altura, radio, oper);
        assertEquals(expResult, result, 1.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
