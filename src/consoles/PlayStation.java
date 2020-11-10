package consoles;

import games.Game;
import games.PlayStationGame;
import games.xBoxGame;

public class PlayStation implements Console {

    private boolean on = false;
    private Game gameInside;
    @Override
    public void pushPowerButton() {
        this.on = !this.on;
        playGame();
    }

    @Override
    public void insertGame(Game game) {
        this.gameInside = game;
    }

    @Override
    public void playGame() {
        if (gameInside instanceof PlayStationGame && this.on) {
            System.out.println(gameInside.getSplashScreenText());
        }
        if ((gameInside != null) && (gameInside instanceof PlayStationGame)) {
            System.out.println("This type of disc doesn't work with the PlayStation Gaming System");
        }

        if (!this.on){
            System.out.println("");
        }

    }
}
