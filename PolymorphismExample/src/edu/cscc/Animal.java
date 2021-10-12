package edu.cscc;

public abstract class Animal {
    private String color;

    public Animal(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract String speak();
}
