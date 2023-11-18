package game;

public class Gambler {
    private static String name;
    private static int points;
    private static String pcOrGambler;

    public Gambler(String name, int t) {
        if (name == null) {
            this.name = "Gambler " + t;
            pcOrGambler = "PC";
        } else {
            this.name = name + " ";
            pcOrGambler = "RealGamer";
        }
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public String getPCOrGambler() {
        return pcOrGambler;
    }

    public void addPoints(int newPoints) {
        this.points += newPoints;
        if (this.points > Consts.TISCH || this.points == Consts.TISCH) {
            this.points = 1000;
            GameMake.theWin(name);
        }
    }
}
