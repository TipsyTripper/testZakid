package opti;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Minus implements ActionListener {

    private TheCountOfGamblers pain;
    public Minus(TheCountOfGamblers pain) {
        this.pain = pain;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pain.gamblersMinus();
    }
}