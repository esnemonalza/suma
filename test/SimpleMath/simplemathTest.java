/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleMath;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author esnem
 */
public class simplemathTest {
    
    public simplemathTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class simplemath.
     */
    @Test
    public void testAdd() {
        System.out.println("prueba del metodo add");
        int a = 10;
        int b = 2;
        int expResult = 12;
        int result = simplemath.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of mult method, of class simplemath.
     */
    @Test
    public void testMult() {
        System.out.println("mult");
        int a = 5;
        int b = 3;
        int expResult =15;
        int result = simplemath.mult(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of rest method, of class simplemath.
     */
    @Test
    public void testRest() {
        System.out.println("rest");
        int a = 8;
        int b = 2;
        int expResult = 6;
        int result = simplemath.rest(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
