package opti;
import javax.swing.*;

public class TheBackground extends JLabel {
    private String back = "";

    public TheBackground() {
        view();
    }
    void view() {
        setText("Your background is: " + back);
    }
}
