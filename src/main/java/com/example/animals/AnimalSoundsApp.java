package com.example.animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalSoundsApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog", AnimalSound.DOG));
        animals.add(new Animal("Cat", AnimalSound.CAT));
        animals.add(new Animal("Cow", AnimalSound.COW));
        animals.add(new Animal("Duck", AnimalSound.DUCK));
        animals.add(new Animal("Horse",AnimalSound.HORSE));

        for (Animal animal : animals) {
            System.out.println(animal.getType() + " makes sound: " + animal.getSound().getSound());
        }
    }
}