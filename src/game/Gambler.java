package game;

public class Gambler {
    private String name;
    private int points;

    public Gambler(String name) { //to-do
        this.name = name;
        //this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int newPoints) {
        this.points += newPoints;
        if (this.points > Consts.TISCH || this.points == Consts.TISCH) {
            this.points = 1000;
            GameMake.theWin(name);
        }
    }
}
