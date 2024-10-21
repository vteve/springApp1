package ru.varnikov.alex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestForMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer1", MusicPlayer.class);
//        System.out.println(musicPlayer1.playMusic());

        MusicPlayer musicPlayer2 = context.getBean("musicPlayer1", MusicPlayer.class);
        MusicPlayer musicPlayer3 = context.getBean("musicPlayer1", MusicPlayer.class);
        MusicPlayer musicPlayer4 = context.getBean("musicPlayer1", MusicPlayer.class);

//        System.out.println(musicPlayer2.playMusic());
//        System.out.println(musicPlayer2.getName());
//        System.out.println(musicPlayer2.getVolume());
//
//        musicPlayer1.setVolume(1);
//        System.out.println(musicPlayer2.getVolume());
//
        boolean comparison = musicPlayer1 == musicPlayer2;
        System.out.println(comparison);
        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);

        context.close();
    }
}
