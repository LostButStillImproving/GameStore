import consoles.PlayStation;
import consoles.XBox;
import games.Game;
import games.PlayStationGame;
import games.xBoxGame;

import java.util.*;

class GameStore {
    Scanner scan = new Scanner(System.in);
    HashMap<String, Game> games = new HashMap<>();
    XBox xBox = new XBox();
    PlayStation playStation = new PlayStation();


    public GameStore() {
        fillGameStore();
    }

    void fillGameStore() {
        games.put("Halo 3", new xBoxGame("Halo 3"));
        games.put("Ratchet&Clank", new PlayStationGame("Ratchet&Clank"));
    }

    void printListOfGames() {
        Iterator playStationIterator = games.entrySet().iterator();
        Iterator xBoxIterator = games.entrySet().iterator();
        System.out.println("PlayStation games: ");
        while (playStationIterator.hasNext()){
            Map.Entry pair = (Map.Entry)playStationIterator.next();
            if(pair.getValue() instanceof PlayStationGame) {
                System.out.println(pair.getKey());
            }
        }
        System.out.println();
        System.out.println("xBox Games");
        while (xBoxIterator.hasNext()){
            Map.Entry pairs = (Map.Entry)xBoxIterator.next();
            if(pairs.getValue() instanceof xBoxGame) {
                System.out.println(pairs.getKey());
            }
        }
        System.out.println();
    }

    void choseConsoleToInsertGameInto() {
        System.out.println("which console?");
        System.out.println("xBox[1] or PlayStation[2]");
        int choice = Integer.parseInt(scan.nextLine());
        switch (choice) {
            case 1 -> this.xBox.insertGame(choseGame());
            case 2 -> this.playStation.insertGame(choseGame());
        }
    }

    private Game choseGame() {
        while (true) {
            System.out.println("What game do you want to insert?");
            printListOfGames();
            System.out.println("Type the exact name:");
            System.out.println();
            String choice = scan.nextLine();
            if (games.containsKey(choice)) {
                return games.get(choice);
            } else {
                System.out.println("Game isnt on the list, try again");
                System.out.println();
            }
        }
    }
}

