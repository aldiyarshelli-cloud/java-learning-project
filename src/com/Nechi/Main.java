package com.Nechi;

import java.util.ArrayList;

interface SoundMaker {
    void makeSound();
}

class Dog implements SoundMaker {
    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }
}

class Car implements SoundMaker {
    @Override
    public void makeSound() {
        System.out.println("Бип-бип");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<SoundMaker> sound = new ArrayList<>();
        sound.add(new Dog());
        sound.add(new Car());

        for (SoundMaker ms : sound) { // ms - make sound
            ms.makeSound();
        }
    }
}