package com.example.animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalSoundsApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog", "Woof"));
        animals.add(new Animal("Cat", "Meow"));
        animals.add(new Animal("Cow", "Moo"));

        for (Animal animal : animals) {
            System.out.println(animal.getType() + " makes sound: " + animal.getSound());
        }
    }
}