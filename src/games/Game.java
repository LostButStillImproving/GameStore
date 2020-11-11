package games;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Game {

    @Override
    public String toString(){
        return this.getNameOfGame();
    }
    private final String nameOfGame;
    private static final Map<String, String> splashScreenText = Stream.of(new String[][] {{ "Ratchet&Clank", "Welcome To Ratchet and Clank" }, { "Halo 3", "Welcome to Halo 3" },
    }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

    public Game(String nameOfGame) {
        this.nameOfGame = nameOfGame;
    }

    public String getNameOfGame() {
        return nameOfGame;
    }

    public String getSplashScreenText() {
        return splashScreenText.get(nameOfGame);
    }
}
