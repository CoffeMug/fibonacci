package com.numbers;

import java.util.Scanner;

public class Numbers {
    protected static long getValue(final int num) {
        //return tailRecursiveFib(num, 1, 0);
        //return recFibonacci(num);
        return fibonacci(num);
    }

    public static void main(String[] args) {
        System.out.println("Please enter an integer "); 
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        long result = getValue(i);
        System.out.println("The result is:" + Long.toString(result)); 
    }

    private static long recFibonacci(final int number) {
        switch (number) {
        case 1 : return 1;
        case 2 : return 1;
        default : return recFibonacci(number -1) + recFibonacci(number - 2);
        }
    }

    private static long fibonacci(final int number) {
        long x=1, y=1;
        for (int i = 1; i < number; i++) {
            long z = x + y; 
            y = x;
            x = z;
        }
        return y;
    }

    public static long tailRecursiveFib(int n, long a, long b) {
        return n == 0 ? b : tailRecursiveFib(n-1, a+b, a);
    }


}
