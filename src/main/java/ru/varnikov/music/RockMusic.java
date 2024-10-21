package ru.varnikov.music;

import org.springframework.stereotype.Component;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Die, die, die my darling";
    }
}
