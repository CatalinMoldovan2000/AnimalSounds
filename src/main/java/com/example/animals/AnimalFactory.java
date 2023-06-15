package com.example.animals;

public class AnimalFactory {

    public static Animal createAnimal(String type) {
        switch (type) {
            case "Dog":
                return new Animal("Dog","Woof");
            case "Cat":
                return new Animal("Cat", "Meow");
            case "Cow":
                return new Animal("Cow", "Moo");
            case "Duck":
                return new Animal("Duck", "Quack");
            default:
                throw new IllegalArgumentException("Invalid animal type: " + type);
        }
    }
}
