package edu.cscc;

public class Dog extends Animal {
    public Dog(String color) {
        super(color);
    }

    public String speak() {
        return "woof, woof";
    }
}
