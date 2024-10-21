package ru.varnikov.enumMusic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestForMusic {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Computer computer = context.getBean("computer", Computer.class);

        System.out.println(computer.toString());

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer1 == musicPlayer2);

        context.close();
    }
}
