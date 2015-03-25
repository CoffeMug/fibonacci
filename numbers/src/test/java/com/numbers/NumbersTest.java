package com.numbers;

import org.junit.*;
import static org.junit.Assert.*;


/**
 * Set of unit tests to test the Number 
 * function.
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

}


