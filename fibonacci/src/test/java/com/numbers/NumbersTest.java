package com.numbers;

import org.junit.*;
import static org.junit.Assert.*;


/**
 * Set of unit tests to test the Number's 
 * getValue function.
 * @author Amin
 */

public class NumbersTest {
    private static Numbers num;

    @BeforeClass
    public static void runBeforeClass() {
        num = new Numbers();
    }

    @Test
    public final void outPutOneIfInputOne() {
        assertEquals(1L, num.getValue(1));
    }

    @Test
    public final void outPutOneIfInputTwo() {
        assertEquals(1L, num.getValue(2));
    }

    @Test
    public final void outPutCorrectOnSomeRandomInput() {
        assertEquals(21L, num.getValue(8));
        assertEquals(8L, num.getValue(6));
        assertEquals(2L, num.getValue(3));
        assertEquals(34L, num.getValue(9));
    }
}



