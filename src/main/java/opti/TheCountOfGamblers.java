package opti;
import javax.swing.*;

public class TheCountOfGamblers extends JLabel {
    private int gamblers = Consts.MIN_GAMBLERS;

    public TheCountOfGamblers() {
        view();
    }

    public void gamblersPlus() {
        if (gamblers == Consts.MAX_GAMBLERS) {
            return;
        }

        gamblers ++;
        view();
    }

    public void gamblersMinus() {
        if (gamblers == Consts.MIN_GAMBLERS) {
            return;
        }

        gamblers --;
        view();
    }

    public int getGamblers() {
        return gamblers;
    }
    private void view() {
        setText("Count of gamblers: " + gamblers);
    }
}
