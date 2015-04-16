package com.fibonacci;

import java.math.BigInteger;
import org.junit.*;
import static org.junit.Assert.*;


/**
 * Set of unit tests to test the Number's 
 * getValue function.
 * @author Amin
 */

public class FibonacciTest {
    public static final BigInteger ZERO = BigInteger.ZERO;
    public static final BigInteger ONE  = BigInteger.ONE;
    private static Fibonacci num;

    @BeforeClass
    public static void runBeforeClass() {
        num = new Fibonacci();
    }

    @Test
    public final void outPutOneIfInputOne() {
        assertEquals(ONE, num.fib(1));
        assertEquals(ONE, num.recFib(1));
        assertEquals(ONE, num.tailRecFib(1, ONE, ZERO));
    }

    @Test
    public final void outPutOneIfInputTwo() {
        assertEquals(ONE, num.fib(2));
        assertEquals(ONE, num.recFib(2));
        assertEquals(ONE, num.tailRecFib(2, ONE, ZERO));
    }

    @Test
    public final void outPutCorrectOnSomeRandomInput() {
        assertEquals(BigInteger.valueOf(21), num.fib(8));
        assertEquals(BigInteger.valueOf(21), num.recFib(8));
        assertEquals(BigInteger.valueOf(21), num.tailRecFib(8, ONE, ZERO));
        assertEquals(BigInteger.valueOf(34), num.fib(9));
        assertEquals(BigInteger.valueOf(34), num.recFib(9));
        assertEquals(BigInteger.valueOf(34), num.tailRecFib(9, ONE, ZERO));

    }
}



