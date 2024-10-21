package ru.varnikov.alex;

public class RapMusic implements Music {
    public void doMyInit1() {
        System.out.println("doing my initialization-----------");
    }

    public void doMyDestroy1() {
        System.out.println("doing my destruction------------");
    }

    @Override
    public String getSong() {
        return "Eminem - Mockinbird";
    }
}
