package edu.cscc;

public class Student {
    private String lastName;
    private String firstName;
    private String cougarId;
    private double gpa;

    public Student(String lastName, String firstName, String cougarId, double gpa) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.cougarId = cougarId;
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

    public String getCougarId() {
        return cougarId;
    }

    public void setCougarId(String cougarId) {
        this.cougarId = cougarId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Student name: "+firstName+" "+lastName+"\n");
        str.append("Cougar ID: "+cougarId+"\n");
        str.append("GPA: "+gpa);
        return str.toString();
    }
}
