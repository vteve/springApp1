package ru.varnikov.alex;

public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    //IoC - Invesrion of control
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){

    }

    public String playMusic() {
        return "Now playing: " + music.getSong();
    }

    public void setMusic(Music music) {
        this.music = music;
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
