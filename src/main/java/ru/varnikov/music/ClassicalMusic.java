package ru.varnikov.music;

import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music {
    ClassicalMusic() {

    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
