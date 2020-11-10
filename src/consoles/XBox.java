package consoles;

import games.*;

public class XBox implements Console {


    private boolean on = false;
    private Game gameInside;


    @Override
    public void pushPowerButton() {
        this.on = !this.on;
        playGame();
    }
    public void insertGame(Game game) {
        this.gameInside = game;
        playGame();
    }

    @Override
    public void playGame() {
        if (gameInside instanceof xBoxGame && this.on) {
            System.out.println(gameInside.getSplashScreenText());
        }
        if ((gameInside != null) && !(gameInside instanceof xBoxGame)) {
            System.out.println("This type of disc doesn't work with the PlayStation Gaming System");
        }

        if (!this.on){
            System.out.println("");
        }
    }
}
