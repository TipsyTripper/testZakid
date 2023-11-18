package game;

import opti.TheBolt;
import opti.TheCountOfGamblers;

import java.util.ArrayList;

public class GameMake {

    private static Game game;
    private static Win win;

    public static ArrayList<Object> createListOfGamblers (int painOfGamblers) {
        ArrayList<Object> gamblers = new ArrayList<Object>();
        for (int t = 1; t < painOfGamblers; ++t) {
            String name = "Gambler " + Integer.toString(t);
            gamblers.add(new Gambler(name, t));
        }
        return gamblers;
    }


    public static void maneGame(TheCountOfGamblers painOfGamblers, TheBolt painOfBolt) {
        game = new Game(painOfGamblers, painOfBolt);
        game.setVisible(true);
        game.setResizable(false);
    }
    public static void gameDispose() {
        game.dispose();
    }

    public static void theWin(String winner) {
        win = new Win(winner);
        win.setVisible(true);
        win.setResizable(false);
    }
    public static void winDispose() {
        win.dispose();
    }

}
