import consoles.PlayStation;
import consoles.XBox;
import games.*;

import java.util.ArrayList;
import java.util.stream.IntStream;

class GameStore {
    ArrayList<Game> xBoxGames = new ArrayList<>();
    ArrayList<Game> playStationGames = new ArrayList<>();

    ArrayList<Game> games = new ArrayList<>();

    void fillGameStore(){
        xBoxGames.add(new xBoxGame ("Halo 3"));
        playStationGames.add(new PlayStationGame("Ratchet&Clank"));

    }

    void printListOfGames() {
        System.out.println("xBox Games: ");
        xBoxGames.forEach(game -> System.out.print(game.getNameOfGame() + ", "));
        System.out.println();
        System.out.println("PlayStation games: ");
        playStationGames.forEach(game -> System.out.print(game.getNameOfGame() + ", "));
        System.out.println();

    }

    public static void main(String[] args) {
        GameStore gameStore = new GameStore();
        gameStore.fillGameStore();

        XBox xBox = new XBox();
        PlayStation playStation = new PlayStation();
        xBox.insertGame(gameStore.xBoxGames.get(0));
        xBox.pushPowerButton();
    }
}
