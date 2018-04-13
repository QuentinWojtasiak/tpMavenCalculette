/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.formation.java;

import junit.framework.TestCase;

/**
 *
 * @author diginamic09
 */
public class CalculetteTest extends TestCase {

    /**
     * Test of add method, of class Calculette.
     */
    public void testAdd() {
        System.out.println("add");
        int a = 2;
        int b = 3;
        Calculette instance = new Calculette();
        int expResult = 5;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }
    
}
