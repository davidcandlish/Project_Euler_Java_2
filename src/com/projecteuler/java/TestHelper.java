package com.projecteuler.java;

import org.junit.Test;
import static junit.framework.TestCase.*;

public class TestHelper {

    @Test
    public void testPrimeCheck() {
        assertFalse(helper.PrimeCheck(0));
        assertFalse(helper.PrimeCheck(1));
        assertTrue(helper.PrimeCheck(2));
        assertTrue(helper.PrimeCheck(13));

    }
    @Test
    public void testSumSquares() {

        assertEquals( 0, helper.sumSquares(0));
        assertEquals(385, helper.sumSquares(10));

    }
    @Test
    public void testsquareSums() {


        assertEquals(0, helper.squareSums(0));
        assertEquals(1, helper.squareSums(1));
        assertEquals(3025, helper.squareSums(10));

    }
}
