package edu.cscc;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    // TODO - once your code is working and tested, switch to the file bigsurnames.ser
    private static final String SERFNAME = "surnames.ser";

    public static void main(String[] args) {

        String[] surnames;

        try {
            surnames = CensusData.deserialize(SERFNAME);
            System.out.println("Unsorted array of "+surnames.length+" names");
            top5names(surnames);
            System.out.println("=========================");

            System.out.println("Sort array with Bubble Sort");
            long start = System.currentTimeMillis();
            // TODO - once you've implemented Bubble Sort - call your Bubble Sort's sort method to sort the array
            long stop = System.currentTimeMillis();
            System.out.println("Elapsed time: "+(stop-start)+" milliseconds");
            top5names(surnames);
            System.out.println("=========================");

            surnames = CensusData.deserialize(SERFNAME);
            System.out.println("Sort array with Java built-in sort");
            start = System.currentTimeMillis();
            // TODO - Use Java's built-in sort method to sort the array
            stop = System.currentTimeMillis();
            System.out.println("Elapsed time: "+(stop-start)+" milliseconds");
            top5names(surnames);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Cannot read file "+SERFNAME);
        }
    }

    public static void top5names(String[] names) {
        System.out.println("Top 5 names in list");
        for (int i=0; i<5; ++i) {
            System.out.println(names[i]);
        }
    }
}
