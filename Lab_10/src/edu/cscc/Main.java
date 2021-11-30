package edu.cscc;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student[] students = TestData.createStudents();
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                String lastname1 = s1.getLastName();
                String lastname2 = s2.getLastName();
                return lastname1.compareTo(lastname2);
            }
        });
        printStudentList("Students Sorted By LastName",students);

        // TODO - sort students by major
        printStudentList("Students Sorted By Major",students);

        // TODO - sort students by zip code
        printStudentList("Students Sorted By Zip Code",students);

        // TODO - sort students by GPA
        printStudentList("Students Sorted By GPA",students);
    }

    public static void printStudentList(String title,Student[] list) {
        final String format = "%-12s %-12s %-18s %-12s %-12s\n";
        System.out.println(title);
        System.out.printf(format,"First Name","Last Name","Major","Zip Code","GPA");
        for (Student s : list) {
            System.out.printf(format,s.getFirstName(),s.getLastName(),s.getMajor(),s.getZipcode(),s.getGpa());
        }
        System.out.println("==============================================================\n");
    }
}
