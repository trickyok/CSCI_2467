package edu.cscc;

public class Duck extends Animal {
    public Duck(String color) {
        super(color);
    }

    public String speak() {
        return "quack, quack";
    }
}
