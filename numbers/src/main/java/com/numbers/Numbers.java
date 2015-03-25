package com.numbers;

import java.util.Scanner;

public class Numbers {
    protected static int getValue(final int num) 
        throws IllegalArgumentException {
        if (num > 0 && num < 10) {
            switch (num) {
            case 1: return 1;
            case 2: return 1;
            default: return (getValue(num-1) + getValue(num-2));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter an integer (1-9)"); 
        Scanner scan = new Scanner(System.in);
        //        String s = scan.next();
        int i = scan.nextInt();
        int result = getValue(i);
        System.out.println("The result is:" + Integer.toString(result)); 
    }

}
