package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer array[] = {4, 5, 3, 10, 1};
        for (int i = array.length - 1; i >= 1; i--) {
            comparision(array, i);
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
        }
        if (array[0] > array[1]) {
            int tmp = array[0];
            array[0] = array[1];
            array[1] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void comparision(Integer[] array, int rightBorder) {
        for (int i = rightBorder; i >= 0; i--) {
            int maxIndex = i;
            int max = array[i];
            if (2 * i + 1 <= rightBorder) {
                int b = array[2 * i + 1];
                if (b > max) {
                    maxIndex = 2 * i + 1;
                    max = b;
                }
            }
            if (2 * i + 2 <= rightBorder) {
                int c = array[2 * i + 2];
                if (c > max) {
                    maxIndex = 2 * i + 2;
                    max = c;
                }
            }
            if (maxIndex != i) {
                int tmp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = tmp;
            }
        }
    }
}