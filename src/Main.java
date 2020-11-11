import consoles.PlayStation;
import consoles.XBox;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static GameStore gameStore = new GameStore();

    static XBox xBox = gameStore.xBox;
    static PlayStation playStation = gameStore.playStation;
    private static int choseAction() {

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println();
            System.out.println("""
                    Print list of games available        : Press 1
                    Choose a console to insert game into : Press 2
                    
                    Press xBox power button              : Press 3
                    Press PlayStation power button       : press 4
                    
                    Remove game from xBox                : press 5
                    Remove game from PlayStation         : press 6
                    
                    
                    Leave the store                      : press 7
                    
                    
                    """);

            int choice = Integer.parseInt(scan.nextLine());
            switch (choice) {
                case 1 -> gameStore.printListOfGames();
                case 2 -> gameStore.choseConsoleToInsertGameInto();

                case 3 -> xBox.pushPowerButton();
                case 4 -> playStation.pushPowerButton();

                case 5 -> xBox.removeGame();
                case 6 -> playStation.removeGame();

                case 7 -> {return 0;}
            }
        }
    }



    public static void main(String[] args) {
        choseAction();
    }
}

