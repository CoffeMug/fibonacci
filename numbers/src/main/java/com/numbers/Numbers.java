package com.numbers;

public class Numbers {
    public static int getValue(final int num) throws IllegalArgumentException {
        if (num > 0) {
            return num;
        } else {
            throw new IllegalArgumentException();
        }
    }

}
