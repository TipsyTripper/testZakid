package game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinButton implements ActionListener {
    public WinButton(JButton win) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GameMake.theWin("Player1");
    }
}
