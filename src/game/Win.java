package game;

import javax.swing.*;
import java.awt.*;

public class Win extends JFrame {
    public Win(String winner) {
        super("WIIIN!!!");
        this.setBounds(Consts.SIX_HUNDRED + Consts.HUNDRED, Consts.HUNDRED * 2, Consts.SIX_HUNDRED / 2, Consts.SIX_HUNDRED / 2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(new PainterForWinner(winner));

        JButton ok = new JButton("Ok, bb");
        this.add(ok, BorderLayout.SOUTH);

        ok.addActionListener(new OkButton(ok));
    }

    static class PainterForWinner extends JComponent {

        private static String winner;

        public PainterForWinner(String winner) {
            this.winner = winner;
        }

        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;

            Font font = new Font("Comic Sans MS", Font.BOLD, Consts.FONT_SIZE);
            g2.setFont(font);
            g2.setPaint(Color.blue);
            int hun = Consts.SIX_HUNDRED / 2 / 2 / 2;

            g2.drawString("Winner is...", hun, hun);

            font = new Font("Comic Sans MS", Font.BOLD, Consts.FONT_SIZE * 2);
            g2.setFont(font);
            g2.setPaint(Color.pink);
            g2.drawString(winner, hun, hun * 2);
        }
    }
}
