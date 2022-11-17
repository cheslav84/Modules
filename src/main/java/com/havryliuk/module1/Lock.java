package com.havryliuk.module1;

import java.util.Arrays;

public class Lock {
    private final int[] array;

    public Lock(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void printArray(){
        System.out.println(Arrays.toString(array));
    }
}
