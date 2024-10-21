package ru.varnikov.enumMusic;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private final List<String> songs = new ArrayList<>();

    {
        songs.add("Chop Suey");
        songs.add("In the end");
        songs.add("Sonne");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        return songs.get(random.nextInt(0, 3));
    }
}
