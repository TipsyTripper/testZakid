package opti;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Plus implements ActionListener {

    private TheCountOfGamblers pain;
    public Plus(TheCountOfGamblers pain) {
        this.pain = pain;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pain.gamblersPlus();
    }
}
