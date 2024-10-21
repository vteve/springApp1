package ru.varnikov.enumMusic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
//@Scope("prototype")
public class MusicPlayer {
    private final List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    //IoC - Invesrion of control

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2, @Qualifier("rapMusic") Music music3) {
        musicList.add(music2);
        musicList.add(music3);
        musicList.add(music1);
    }

    public String playMusic(GenreOfMusic genreOfMusic) {
        if (genreOfMusic == GenreOfMusic.ROCK) {
            return musicList.get(2).getSong();
        } else if (genreOfMusic == GenreOfMusic.RAP) {
            return musicList.get(1).getSong();
        } else {
            return musicList.get(0).getSong();
        }
    }

    public List<Music> getMusicList() {
        return musicList;
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
