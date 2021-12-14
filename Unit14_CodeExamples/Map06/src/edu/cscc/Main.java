package edu.cscc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    private static HashMap<String, Student> studentMap;
    private static Scanner input = new Scanner(System.in);

    static {
        studentMap = new HashMap<>();
        ArrayList<Student> students = GenerateTestData.createStudentList();
        for (Student student : students) {
            studentMap.put(student.getStudentId(), student);
        }
    }

    public static void main(String[] args) {
        String studentId;
        Properties props = Configuration.getProps();
        String studentIdName = props.getProperty("idname");
        String college = props.getProperty("college");
        System.out.println(("Welcome to "+college+"\n"+
                "Lookup Student by "+studentIdName));
        boolean stillProcessing = true;
        do {
            System.out.print("Enter "+studentIdName+" (or 'quit' to end): ");
            studentId = input.nextLine().trim();
            stillProcessing = !"quit".equalsIgnoreCase(studentId);
            if (stillProcessing) {
                Student student = studentMap.get(studentId);

                if (student != null) {
                    System.out.println(student.toString(studentIdName));
                } else {
                    System.out.println(studentIdName + ": " + studentId + " not found");
                }
            }
        } while(stillProcessing);
    }
}
