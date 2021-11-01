package edu.cscc;
import java.util.*;
import java.util.Scanner;

public class test {

    public static void main() {

        int total = 0;
        for (int i=0; i<20; ++i) {
            for (int j=0; j<20; ++j) {
                for (int k=0; k<10; ++k) {
                    total++;
                }
            }
        }
        System.out.println(total);

    }

}