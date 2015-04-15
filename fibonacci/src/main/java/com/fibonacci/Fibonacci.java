package com.fibonacci;

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
        long result = 0;
        int a = 0;
        if (scan.hasNextInt()) {
            a = scan.nextInt() ; 
        } else {
            System.out.println("Enter one of the above option in number!");
        }

        long startTime = 0;
        long endTime = 0;

        switch (a) {
        case 1: startTime = System.nanoTime(); result = recFib(number); endTime = System.nanoTime(); break;
        case 2: startTime = System.nanoTime(); result = tailRecFib(number, 1, 0); endTime = System.nanoTime(); break;
        case 3: startTime = System.nanoTime(); result = fib(number); endTime = System.nanoTime(); break;
        default: System.out.print("Invalid method selected!"); break;
        }
        System.out.println("The result is:" + Long.toString(result));
        System.out.println("Elapsed time in nanoseconds:" + (endTime - startTime)); 
    }

    protected static long recFib(final int number) {
        switch (number) {
        case 1 : return 1;
        case 2 : return 1;
        default : return recFib(number -1) + recFib(number - 2);
        }
    }

    protected static long fib(final int number) {
        long x=1, y=1;
        for (int i = 1; i < number; i++) {
            long z = x + y; 
            y = x;
            x = z;
        }
        return y;
    }

    protected static long tailRecFib(int n, long a, long b) {
        return n == 0 ? b : tailRecFib(n-1, a+b, a);
    }
}
