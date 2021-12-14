package edu.cscc;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] actual = {5, 1, 6, 2, 3, 4};

        bubbleSort(actual);
        System.out.println(Arrays.toString(actual));
    }

    public static void bubbleSort(int[] list) {
        boolean changed = true;
        do {
            changed = false;
            for (int j = 0; j <= list.length - 2; j++)
                if (list[j] > list[j + 1]) {
                    //swap list[j] wiht list[j+1]
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    changed = true;
                }
        } while (changed);
    }
}