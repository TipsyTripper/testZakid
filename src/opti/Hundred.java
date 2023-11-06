package opti;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hundred implements ActionListener {
    private TheBolt pain;
    public Hundred(TheBolt pain) {
        this.pain = pain;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pain.boltHundred();
    }
}
