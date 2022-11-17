package com.havryliuk.module1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UserCommunicator userCommunicator = new UserCommunicator();
        int arrayLength = userCommunicator.getArrayLengthFromUser(10);

        int [] array = ArrayUtils.getRandomArray(arrayLength, -100, 100);
        System.out.println(Arrays.toString(array));

        boolean ascendingOrder = userCommunicator.getWayOfSorting();
        if (ascendingOrder) {
            ArrayUtils.sortAscendingOrder(array);
        } else {
            ArrayUtils.sortDescendingOrder(array);
        }
        System.out.println(Arrays.toString(array));

        ArrayUtils.setThirdToPowerThree(array);
        System.out.println(Arrays.toString(array));




        int [] arr =new int[] {1, 3, 5};
        Lock lockedArray = new Lock(arr);
        lockedArray.printArray();
        lockedArray.getArray()[0] = 7;
        lockedArray.printArray();

    }
}
