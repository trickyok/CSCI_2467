package edu.cscc;

import java.util.Arrays;
import java.util.Comparator;

/* Charles Farmer
Sorts students by a variety of factors
Last Name, Major, Zip Code, and GPA
11/29/2021 - Accidentally late
 */
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

        // sort students by major
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                String major1 = s1.getMajor();
                String major2 = s2.getMajor();
                return major1.compareTo(major2);
            }
        });
        printStudentList("Students Sorted By Major",students);

        // sort students by zip code
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                int zip1 = s1.getZipcode();
                int zip2 = s2.getZipcode();
                if (zip1 > zip2) { return 1; }
                else if (zip1 < zip2) { return -1; }
                else return 0;
            }
        });
        printStudentList("Students Sorted By Zip Code",students);

        // sort students by GPA
        Arrays.sort(students,new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                double gpa1 = s1.getGpa();
                double gpa2 = s2.getGpa();
                if (gpa1 < gpa2) { return 1; }
                else if (gpa1 > gpa2) { return -1; }
                else return 0;
            }
        });
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
