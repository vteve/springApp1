package ru.varnikov.enumMusic;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import jakarta.annotation.PostConstruct;


@Component
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing destroy");
    }

    private final List<String> songs = new ArrayList<>();

    {
        songs.add("To Eliza");
        songs.add("Moonlight Sonata");
        songs.add("Flight of the Bumblebee");
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        Random random = new Random();
        return songs.get(random.nextInt(0, 3));
    }
}
