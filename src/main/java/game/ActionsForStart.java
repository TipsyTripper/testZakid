package game;

import opti.TheBolt;
import opti.TheCountOfGamblers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionsForStart implements ActionListener {
    private TheCountOfGamblers painOfGamblers = new TheCountOfGamblers();
    private TheBolt painOfBolt = new TheBolt();
    public ActionsForStart(TheCountOfGamblers painOfGamblers, TheBolt painOfBolt) {
        this.painOfGamblers = painOfGamblers;
        this.painOfBolt = painOfBolt;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GameMake.maneGame(painOfGamblers, painOfBolt);
    }
}
