package com.example.animals;

public class Animal {
    private String type;
    private AnimalSound sound;

    public Animal(String type, AnimalSound sound) {
        this.type = type;
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public AnimalSound getSound() {
        return sound;
    }
}