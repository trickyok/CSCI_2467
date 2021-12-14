package edu.cscc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<String, Student> studentMap;
    private static Scanner input = new Scanner(System.in);

    static {
        studentMap = new HashMap<>();
        ArrayList<Student> students = GenerateTestData.createStudentList();
        for (Student student : students) {
            studentMap.put(student.getCougarId(), student);
        }
    }

    public static void main(String[] args) {
        String cougarId;
        System.out.println(("Lookup Student by Cougar ID"));
        boolean stillProcessing = true;
        do {
            System.out.print("Enter Cougar ID (or 'quit' to end): ");
            cougarId = input.nextLine().trim();
            stillProcessing = !"quit".equalsIgnoreCase(cougarId);
            if (stillProcessing) {
                Student student = studentMap.get(cougarId);

                if (student != null) {
                    System.out.println(student);
                } else {
                    System.out.println("Cougar ID: " + cougarId + " not found");
                }
            }
        } while(stillProcessing);
    }
}
