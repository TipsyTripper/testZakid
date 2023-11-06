package opti;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Half implements ActionListener {
    private TheBolt pain;
    public Half(TheBolt pain) {
        this.pain = pain;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pain.boltHalf();
    }
}
