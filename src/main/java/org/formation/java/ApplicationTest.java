package org.formation.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ApplicationTest extends TestCase {

    /**
     * @return the suite of tests being tested
     */
    
    Calculette cal = new Calculette();

    
    public static Test suite() {
        return new TestSuite(ApplicationTest.class);
    }
    
    public void testOperation()
    {
        assertEquals(10,cal.add(7,3));
    }
    
}
