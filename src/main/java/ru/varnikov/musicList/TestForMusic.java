package ru.varnikov.musicList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestForMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayerList", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName() + "||" + musicPlayer.getVolume());
        context.close();
    }
}
