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

    @Test(expected = IllegalArgumentException.class)
    public final void throughExceptionIfInputIsNotPositiveInteger() {
        num.getValue(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public final void throughExceptionIfInputIsZero() {
        num.getValue(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public final void throughExceptionIfInputBiggerThanNine() {
        num.getValue(10);
    }

    @Test
    public final void outPutOneIfInputOne() {
        assertEquals(1, num.getValue(1));
    }

    @Test
    public final void outPutOneIfInputTwo() {
        assertEquals(1, num.getValue(2));
    }

    @Test
    public final void outPutCorrect() {
        assertEquals(num.getValue(1) + num.getValue(2), num.getValue(3));
        assertEquals(num.getValue(7) + num.getValue(8), num.getValue(9));
        assertNotEquals(num.getValue(3) + num.getValue(4), num.getValue(6));
    }

    @Test
    public final void outPutCorrectOnSomeRandomInput() {
        assertEquals(21, num.getValue(8));
        assertEquals(8, num.getValue(6));
        assertEquals(2, num.getValue(3));
        assertEquals(34, num.getValue(9));
    }
}



