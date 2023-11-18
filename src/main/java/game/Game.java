package game;

import opti.TheBolt;
import opti.TheCountOfGamblers;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class Game extends JFrame {

    private static int countOfGamblers;
    private static ArrayList<Object> gamblers;

    private static TheBolt painOfBolt;
    public Game(TheCountOfGamblers painOfGamblers, TheBolt painOfBolt) {
        super("Game!!!!!");
        this.setBounds(Consts.SIX_HUNDRED, Consts.HUNDRED, Consts.SIX_HUNDRED, Consts.SIX_HUNDRED);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.add(new Painter());

        this.countOfGamblers = painOfGamblers.getGamblers();
        this.painOfBolt = painOfBolt;
        gamblers = GameMake.createListOfGamblers(countOfGamblers);

        JButton win = new JButton("WIIIIN!!!");
        this.add(win, BorderLayout.SOUTH);

        win.addActionListener(new WinButton(win));

    }




    static class Painter extends JComponent {

        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;

            Image image = new ImageIcon("src/main/resources/img/back1.png").getImage();
            g2.drawImage(image, Consts.IDENTATION, Consts.IDENTATION, Consts.RECTANGLE_X, Consts.RECTANGLE_Y, null);

            int x = Consts.RECTANGLE_Y / (countOfGamblers * countOfGamblers);
            int colourR = Consts.HUNDRED;
            int colourG = Consts.HUNDRED;
            int colourB = Consts.COLOR_B2;
            int partOfColor = Consts.MAX_COLOR / countOfGamblers / 2;
            Font font = new Font("Comic Sans MS", Font.BOLD, Consts.FONT_SIZE_FIFTH);
            g2.setFont(font);

            for (int t = 0; t < countOfGamblers - 1; ++t) {
                Ellipse2D elley = new Ellipse2D.Float(x, Consts.ELLIPSE_SIZE, Consts.ELLIPSE_SIZE, Consts.ELLIPSE_SIZE);
                g2.setPaint(new Color(colourR, colourG, colourB));
                g2.fill(elley);

                Image im = new ImageIcon("src/main/resources/img/cat-gambler.png").getImage();
                g2.drawImage(im, x, Consts.ELLIPSE_SIZE, Consts.ELLIPSE_SIZE, Consts.ELLIPSE_SIZE, null);
                
                Gambler gambler = (Gambler)gamblers.get(t);
                g2.setPaint(Color.yellow);
                g2.drawString(gambler.getName(), x, Consts.HUNDRED * 2);
                g2.drawString("Points : " + gambler.getPoints(), x, Consts.HUNDRED * 2 + Consts.FONT_SIZE);
                g2.drawString("It is : " + gambler.getPCOrGambler(), x, Consts.HUNDRED * 2 + Consts.FONT_SIZE * 2);

                x += Consts.RECTANGLE_Y / countOfGamblers;
                colourR += partOfColor;
                colourG += partOfColor;
                colourB -= partOfColor;
            }

        }
    }

}
