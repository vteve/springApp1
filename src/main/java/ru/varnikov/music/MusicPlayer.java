package ru.varnikov.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    List<Music> musicList = new ArrayList<>();
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    //IoC - Invesrion of control
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {

    }

    public String playMusic() {
        Random random = new Random();
        return musicList.get(random.nextInt(0, 3)).getSong();
    }

    public List<Music> getMusicList() {
        return musicList;
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
