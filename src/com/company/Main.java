package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Task 1

        int[] numbers = new int[3];
        double[] doubleNumbers = {1.57, 7.654, 9.986};
        char[] tenet = {84, 101, 110, 101, 116};

        // Task 2
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int z = 0; z < numbers.length; z++) {
            numbers[z] = z + 1;
            System.out.print(numbers[z]);
            if (z < numbers.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < doubleNumbers.length; i++) {
            System.out.print(doubleNumbers[i]);
            if (i < doubleNumbers.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int x = 0; x < tenet.length; x++) {
            System.out.print(tenet[x]);
            if (x < tenet.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        // Task 3

        for (int v = 0; v < numbers.length; v++) {
            numbers[v] = 3 - v;
            System.out.print(numbers[v]);
            if (v < numbers.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = doubleNumbers.length - 1; i >= 0; i--) {
            if (i < doubleNumbers.length - 1) {
                System.out.print(",");
            }
            System.out.print(doubleNumbers[i]);
        }
        System.out.println();
        for (int x = tenet.length - 1; x >= 0; x--) {
            if (x < tenet.length - 1) {
                System.out.print(",");
            }
            System.out.print(tenet[x]);
        }
        System.out.println();

        // Task 4

        for (int y = 0; y < numbers.length; y++) {
            if (numbers[y] % 2 != 0) {
                numbers[y] = numbers[y] + 1;
            } else if (numbers[y] % 2 == 0) {
            }
            System.out.print(numbers[y]);
            if (y < numbers.length - 1) {
                System.out.print(",");
            }
        }
    }
}
