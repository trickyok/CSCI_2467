package edu.cscc;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("brown"),
                new Cat("orange"),
                new ManxCat("gray"),
                new Cow("black and white"),
                new Duck("green")
        };

        for (Animal animal : animals) {
            String animalType =
                    animal.getClass().toString().replace("class edu.cscc.","");
            System.out.println("The "+animal.getColor()+" "+animalType+" says "+animal.speak());
        }
    }
}
