package opti;
import javax.swing.*;
import java.awt.*;

public class Options extends JFrame{

    public Options(TheCountOfGamblers painOfGamblers, TheBolt painOfBolt) {
        super("Options for your dice");
        this.setBounds(Consts.SIX_HUNDRED, Consts.HUNDRED,Consts.THREE_HUNDRED + Consts.HALF, Consts.THREE_HUNDRED);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JButton plusGambler = new JButton("+ gambler");
        JButton minusGambler = new JButton("- gambler");
        JButton hundred = new JButton("A hundred");
        JButton half = new JButton("A half");
        JLabel voids1 = new JLabel();

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(7, 1, 2,2));

        container.add(painOfGamblers);
        container.add(plusGambler);
        container.add(minusGambler);
        container.add(voids1);
        container.add(painOfBolt);
        container.add(hundred);
        container.add(half);

        plusGambler.addActionListener(new Plus(painOfGamblers));
        minusGambler.addActionListener(new Minus(painOfGamblers));
        hundred.addActionListener(new Hundred(painOfBolt));
        half.addActionListener(new Half(painOfBolt));

    }

}
