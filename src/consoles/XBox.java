package consoles;

import games.*;

public class XBox implements Console {

    private boolean on = false;
    private Game gameInside = null;


    public void pushPowerButton() {
        if (this.on) {
            this.on = false;
            System.out.println("The xBox turned off");
        } else {
            this.on = true;
            checkState();
        }
    }
    @Override
    public void insertGame(Game game) {
        if (this.gameInside == null) {
            System.out.println("You put " + game.getNameOfGame() + " into the xBox");
            this.gameInside = game;
            checkState();
        } else System.out.println("There is already a game inside");
    }

    @Override
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
            System.out.println("There is no disc in the xBox");
            System.out.println();
        }
    }

    public void checkState() {
        if (gameInside instanceof xBoxGame && this.on) {
            System.out.println(gameInside.getSplashScreenText());
            System.out.println();
        }
        if ((gameInside != null) && !(gameInside instanceof xBoxGame)) {
            System.out.println("This type of disc doesn't work with the xBox Gaming System");
            System.out.println();
        }
        if (this.on && gameInside == null) {
            System.out.println("Welcome to xBox, insert disc");
            System.out.println();
        }
        if (!this.on && gameInside == null){
            System.out.println("Nothing happens..");
            System.out.println();
        }
    }
}
