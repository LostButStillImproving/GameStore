package consoles;

import games.Game;
import games.PlayStationGame;

public class PlayStation implements Console {


    private boolean on = false;
    private Game gameInside;

    public void pushPowerButton() {
        if (this.on) {
            this.on = false;
            System.out.println("The playStation turned off");
            System.out.println();
        } else {
            this.on = true;
            checkState();
        }
    }

    public void insertGame(Game game) {
        if (this.gameInside == null) {
            System.out.println("You put " + game.getNameOfGame() + " into the PlayStation");
            System.out.println();
            this.gameInside = game;
            checkState();
        } else{
            System.out.println("There is already a game inside");
            System.out.println();
        }

    }

    public void removeGame() {
        if (gameInside != null && this.on) {
            System.out.println("You removed the game " + gameInside.getNameOfGame());
            System.out.println("The game froze");
            System.out.println();
            this.gameInside = null;

        } else if (gameInside != null) {
            System.out.println("You removed the game " + gameInside.getNameOfGame());
            System.out.println();
            this.gameInside = null;
        } else {
            System.out.println("There is no disc in the PlayStation");
            System.out.println();
        }
    }

    public void checkState() {
        if (gameInside instanceof PlayStationGame && this.on) {
            System.out.println(gameInside.getSplashScreenText());
            System.out.println();
        }
        if ((gameInside != null) && !(gameInside instanceof PlayStationGame)) {
            System.out.println("This type of disc doesn't work with the PlayStation Gaming System");
            System.out.println();
        }
        if (this.on && gameInside == null) {
            System.out.println("Welcome to PlayStation, insert disc");
            System.out.println();
        }
        if (!this.on && gameInside == null){
            System.out.println("Nothing happens..");
            System.out.println();
        }
    }
}
