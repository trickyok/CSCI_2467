package edu.cscc;

public class Main2 {

    private static void main() {
        long a = 0, b = 2, c = 3, d = 4;
        a++;
        long x = (a > 0) ? -1 : a * b + c * d / 2;
        System.out.println(x);
    }
}

