package opti;
import javax.swing.*;

public class TheBolt extends JLabel {

    private int bolt = 50;

    public TheBolt() {
        view();
    }

    public void boltHundred() {
        bolt = Consts.HUNDRED;
        view();
    }

    public void boltHalf() {
        bolt = Consts.HALF;
        view();
    }

    public int getBolt() {
        return bolt;
    }

    private void view() {
        setText("The Bolt is: " + bolt);
    }
}