package game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OkButton implements ActionListener {

    public OkButton(JButton ok) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        GameMake.winDispose();
        GameMake.gameDispose();
    }
}
