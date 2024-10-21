package ru.varnikov.musicList;


import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    //IoC - Invesrion of control
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {

    }

    public void playMusic() {
        for (int i = 0; i < 25; i++) {
            System.out.print(". ");
        }
        System.out.println(".");
        for (Music element : musicList) {
            System.out.print(". . .now playing. . ." + element.getSong());
            if (element.getSong().length() % 2 == 1) {
                for (int i = 0; i < (51 - 21 - element.getSong().length()) / 2; i++) {
                    System.out.print(". ");
                }
                System.out.println(".");
            } else {
                for (int i = 0; i < (51 - 21 - element.getSong().length()) / 2; i++) {
                    System.out.print(" .");
                }
                System.out.println();
            }
            for (int i = 0; i < 25; i++) {
                System.out.print(". ");
            }
            System.out.println(".");
        }
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
