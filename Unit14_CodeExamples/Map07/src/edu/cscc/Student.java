package edu.cscc;

public class Student {
    private String lastName;
    private String firstName;
    private String studentId;
    private double gpa;

    public Student(String lastName, String firstName, String studentId, double gpa) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString(String studentIdName) {
        StringBuilder str = new StringBuilder();
        str.append("Student name: "+firstName+" "+lastName+"\n");
        str.append(studentIdName+": "+ studentId +"\n");
        str.append("GPA: "+gpa);
        return str.toString();
    }
}
