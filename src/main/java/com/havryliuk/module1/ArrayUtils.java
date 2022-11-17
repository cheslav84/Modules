package com.havryliuk.module1;

import java.util.Random;

public class ArrayUtils {

    public static int[] getRandomArray(int arrayLength, int minValue, int maxValue){
        int [] arr = new int[arrayLength];
        Random randomNumber = new Random();
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = randomNumber.nextInt(minValue, maxValue);
        }
        return arr;
    }

    public static void sortAscendingOrder(int[] arr) {
        int i;
        for (i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]  ) {
                int tmp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tmp;
                j--;
            }
        }
    }

    public static void sortDescendingOrder(int[] arr) {
        int i;
        for (i = arr.length - 1; i > 0; i--) {
            int j = i;
            while (j < arr.length && arr[j - 1] < arr[j]) {
                int tmp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }
    }

    public static void setThirdToPowerThree (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 2) {//every third value
                int value = arr[i];
                value = (int) Math.pow(value, 3);
                arr[i] = value;
            }
        }
    }

}
