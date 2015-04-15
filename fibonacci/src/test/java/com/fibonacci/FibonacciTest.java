package com.fibonacci;

import org.junit.*;
import static org.junit.Assert.*;


/**
 * Set of unit tests to test the Number's 
 * getValue function.
 * @author Amin
 */

public class FibonacciTest {
    private static Fibonacci num;

    @BeforeClass
    public static void runBeforeClass() {
        num = new Fibonacci();
    }

    @Test
    public final void outPutOneIfInputOne() {
        assertEquals(1L, num.fib(1));
        assertEquals(1L, num.recFib(1));
        assertEquals(1L, num.tailRecFib(1,1,0));
    }

    @Test
    public final void outPutOneIfInputTwo() {
        assertEquals(1L, num.fib(2));
        assertEquals(1L, num.recFib(2));
        assertEquals(1L, num.tailRecFib(2,1,0));
    }

    @Test
    public final void outPutCorrectOnSomeRandomInput() {
        assertEquals(21L, num.fib(8));
        assertEquals(21L, num.recFib(8));
        assertEquals(21L, num.tailRecFib(8,1,0));
        assertEquals(34L, num.fib(9));
        assertEquals(34L, num.recFib(9));
        assertEquals(34L, num.tailRecFib(9,1,0));

    }
}



