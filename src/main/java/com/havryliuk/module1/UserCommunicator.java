package com.havryliuk.module1;

import java.util.Scanner;

public class UserCommunicator {

    public int getArrayLengthFromUser(int minValue) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put length of array (minimum value = " + minValue + ")");
        int arrayLength = 0;
            if (scanner.hasNextInt()) {
                arrayLength = scanner.nextInt();
                if (arrayLength < minValue) {
                    System.out.println("Input data isn't correct. \n" +
                            "Minimum value should be " + minValue +
                            ". You entered " + arrayLength +
                            ". \nStart the program and try again");
                    System.exit(0);
                }
            } else {
                System.out.println("You haven't entered a real number. Start the program and try again");
                System.exit(0);
            }
        return arrayLength;
    }

    public boolean getWayOfSorting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to sort array in ascending order, type \"asc\".\n" +
                "Type anything else to sort array in descending order.");
        String order;
        boolean ascendingOrder = true;
        if (scanner.hasNextLine()) {
            order = scanner.nextLine();
            if (order.equalsIgnoreCase("asc") ||
                    order.equalsIgnoreCase("asc.")){
                ascendingOrder = true;
            } else {
                ascendingOrder = false;
            }
        }
        return ascendingOrder;
    }
}
