package opti;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionsToOptions implements ActionListener {

    private TheCountOfGamblers painOfGamblers = new TheCountOfGamblers();
    private TheBolt painOfBolt = new TheBolt();
    public ActionsToOptions(TheCountOfGamblers painOfGamblers, TheBolt painOfBolt) {
        this.painOfGamblers = painOfGamblers;
        this.painOfBolt = painOfBolt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Options options = new Options(painOfGamblers, painOfBolt);
        options.setVisible(true);
    }

}
