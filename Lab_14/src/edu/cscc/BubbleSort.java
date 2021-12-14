package edu.cscc;

public class BubbleSort {
    public static void sort(String[] list) {
        // TODO - implement a Bubble Sort for a String array
        // Use the integer Bubble Sort from Unit 14 as a starting point
        // You'll need to use the String compareTo() method to compare Strings
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
