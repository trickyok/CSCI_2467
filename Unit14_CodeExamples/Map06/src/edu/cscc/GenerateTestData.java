package edu.cscc;

import java.util.ArrayList;

public class GenerateTestData {

    public static ArrayList<Student> createStudentList() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Gates","Bill","1230001",3.9D));
        students.add(new Student("Goldberg","Adele", "1230002",4.0D));
        students.add(new Student("Torvalds","Linus","1230003",3.9D));
        students.add(new Student("Zuckerberg","Mark","1230004",2.5D));
        students.add(new Student("Lovelace","Ada","1230005",4.0D));
        students.add(new Student("Stroustrup","Bjarne","1230006",3.8D));
        students.add(new Student("Stallman","Richard","1230007",3.1D));
        students.add(new Student("Musk","Elon","1230008",2.8D));
        students.add(new Student("Jobs","Steve","1230009",3.7D));
        students.add(new Student("Wozniak","Steve","1230010",4.0D));
        return students;
    }
}
