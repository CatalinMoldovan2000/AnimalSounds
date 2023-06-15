package com.example.animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalSoundsApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(AnimalFactory.createAnimal("Dog"));
        animals.add(AnimalFactory.createAnimal("Cat"));
        animals.add(AnimalFactory.createAnimal("Cow"));
        animals.add(AnimalFactory.createAnimal("Duck"));

        for (Animal animal : animals) {
            System.out.println(animal.getType() + " makes sound: " + animal.getSound());
        }
    }
}