package ru.varnikov.enumMusic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Computer {

    private final MusicPlayer musicPlayer;
    Random random = new Random();
    int id = random.nextInt(1, 4);

    @Autowired
    Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        if (id == 1) {
            return "Computer " + id + " " + musicPlayer.playMusic(GenreOfMusic.ROCK);
        } else if (id == 2) {
            return "Computer " + id + " " + musicPlayer.playMusic(GenreOfMusic.RAP);
        } else {
            return "Computer " + id + " " + musicPlayer.playMusic(GenreOfMusic.CLASSICAL);
        }
    }
}
