package com.example.animals;

public enum AnimalSound {
    DOG("Woof"),
    CAT("Meow"),
    COW("Moo"),
    DUCK("Quack"),
    HORSE("Brrrrr");

    private String sound;

    AnimalSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
