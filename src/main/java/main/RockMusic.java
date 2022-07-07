package main;

import org.springframework.stereotype.Component;

@Component("RockMusic")
public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "RockMusicPlaying";
    }
}
