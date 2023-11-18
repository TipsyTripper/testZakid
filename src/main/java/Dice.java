import javax.swing.*;
import java.awt.*;
import opti.*;
import game.*;


public class Dice extends JFrame{

    public Dice() {
        super("Playful Dices");
        this.setBounds(100, 100,500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TheCountOfGamblers painOfGamblers = new TheCountOfGamblers();
        TheBolt painOfBolt = new TheBolt();

        JButton start = new JButton(new ImageIcon("src/main/resources/img/start.png"));

        JButton options = new JButton(new ImageIcon("src/main/resources/img/Coffee.png"));
        JLabel voids1 = new JLabel();
        voids1.setBackground(Color.gray);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 1));

        container.add(start);
        container.add(voids1);
        container.add(options);

        start.addActionListener(new ActionsForStart(painOfGamblers, painOfBolt));
        options.addActionListener(new ActionsToOptions(painOfGamblers, painOfBolt));
    }
}
