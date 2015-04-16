package com.fibonacci;

import java.math.*;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Please enter an integer ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Please select one of the methods bellow:\n");
        System.out.println("1) Recursive fibonacci\n");
        System.out.println("2) Tail recursive fibonacci\n");
        System.out.println("3) Iterative fibonacci\n");
        BigInteger result = new BigInteger("0");
        int a = 0;
        if (scan.hasNextInt()) {
            a = scan.nextInt();
        } else {
            System.out.println("Enter one of the above option in number!");
        }

        long startTime = 0;
        long endTime = 0;

        switch (a) {
            case 1:
                startTime = System.nanoTime();
                result = recFib(number);
                endTime = System.nanoTime();
                break;
            case 2:
                startTime = System.nanoTime();
                result = tailRecFib(number, BigInteger.ONE, BigInteger.ZERO);
                endTime = System.nanoTime();
                break;
            case 3:
                startTime = System.nanoTime();
                result = fib(number);
                endTime = System.nanoTime();
                break;
            default:
                System.out.print("Invalid method selected!");
                break;
        }
        System.out.println("The result is:" + result.toString());
        System.out.println("Elapsed time in nanoseconds:" + (endTime - startTime));
    }

    protected static BigInteger recFib(final int number) {
        switch (number) {
            case 1:
                return BigInteger.ONE;
            case 2:
                return BigInteger.ONE;
            default:
                return (recFib(number - 1).add(recFib(number - 2)));
        }
    }

    protected static BigInteger fib(final int number) {
        BigInteger x = new BigInteger("1"), y = new BigInteger("1");
        for (int i = 1; i < number; i++) {
            BigInteger z = x.add(y);
            y = x;
            x = z;
        }
        return y;
    }

    protected static BigInteger tailRecFib(int n, BigInteger a, BigInteger b) {
        return n == 0 ? b : tailRecFib(n - 1, a.add(b), a);
    }
}
