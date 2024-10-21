package ru.varnikov.music;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.varnikov.music.Music;
import ru.varnikov.music.MusicPlayer;


public class TestForMusic {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );


//        Music music1 = context.getBean("rapMusic", Music.class);
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        Music music3 = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//        MusicPlayer musicPlayer3 = new MusicPlayer(music3);
//        System.out.println(musicPlayer1.playMusic());
//        System.out.println(musicPlayer2.playMusic());
//        System.out.println(musicPlayer3.playMusic());

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.playMusic());
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer.toString());

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer.toString());

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer1.getName() + " " + musicPlayer1.getVolume());


        context.close();
    }
}
