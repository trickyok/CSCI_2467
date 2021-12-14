package edu.cscc;

public class BubbleSort {
    public static void sort(String[] list) {

        String first, second;
        int i, j, size1 = list.length-1, size2 = list.length-2;

        for (i = 0; i < size1; i++) {

            for (j = 0; j < size2-i; j++) {
                first = list[j];
                second = list[j + 1];

                if (first.compareTo(second) > 0) {
                    list[j] = second;
                    list[j + 1] = first;

                }
            }
        }
    }
}
